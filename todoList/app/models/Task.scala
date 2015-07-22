package models


/**
 * Created by manishkosaraju on 7/15/15.
 */
case class Task (id :Long , label : String)

object Task{

  def all() : List[Task] = Nil

  def create(label: String){}

  def delete (id : Long) {}

}
