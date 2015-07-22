package controllers

import play.api._
import play.api.mvc._

import play.api.data._
import play.api.data.Forms._
import models.Task

class Application extends Controller{

  /*def index = Action {
    Ok(views.html.index("Your new application is ready."))
    //Redirect(routes.Application.tasks)
  }*/

  /*val taskForm = Form (
  "label" -> nonEmptyText
  )*/

  def index = Action {
    Ok(views.html.index())
  }

}
