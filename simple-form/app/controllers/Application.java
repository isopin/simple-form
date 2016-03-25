package controllers;

import models.Person;
import play.data.Form;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.List;


public class Application extends Controller {

    public Result index() {
        return ok(index.render("Hello World"));
    }

    public Result addPerson(){
        Person person = Form.form (Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.Application.index());

    }

    public Result getPeople(){
        List<Person> people = new Model.Finder(Person.class).all();
        return ok(Json.toJson(people));
    }

}
