###$ ->
  $.get"/persons", (persons) ->
    $.each persons,(index, person) ->
       $('#persons').append $("<li>").text person.name###


$ ->
  $.get "/people", (people) ->
    $.each people, (index, person) ->
      $('#people').append $("<li>").text person.name