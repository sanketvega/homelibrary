package controllers

import play.api.mvc.{Action, Controller}
import models.{Book, Author}
import play.api.libs.json.Json

/**
 * @author Lukas Sembera <semberal@gmail.com>
 */
object AuthorController extends Controller {

  def authorPopoverContent(authorId: Long) = Action {
    implicit request =>
      Ok(views.html.tags.authorPopoverContent(Book.getBooks(authorId = Some(authorId))))
  }

}

