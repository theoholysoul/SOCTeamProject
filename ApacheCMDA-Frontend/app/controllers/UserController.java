package controllers;

import models.DataSet;
import models.User;
import patches.GroupedForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.climate.userList;
import views.html.climate.oneUser;

import java.util.List;

import static patches.GroupedForm.form;

//import play.data.Form;
//import static play.data.Form.form;

public class UserController extends Controller {

    final static Form<User> userForm = Form
            .form(User.class);

    /*s
    public static Result signIn() {
        return ok(
                signin.render(form(User.class))
        );
    }
*/
    /**
     * Profile page.
     */
    public static Result profile() {

        return ok(userList.render(User.all(),
                userForm));
    }

    public static Result oneUser(long userId) {
        return ok(oneUser.render(User.getUser(userId)));
    }

    /*
    public static Result authenticate() {
        GroupedForm<User> form = form(User.class, User.SignIn.class).bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(signin.render(form));
        }

        session().clear();
        session("email", form.get().email);

        return redirect(
                routes.Application.index()
        );
    }

    public static Result signOut() {
        session().clear();
        flash("success", "You've been signed out.");

        return redirect(
                routes.UserController.signIn()
        );
    }


    @Security.Authenticated(Secured.class)
    public static Result index() {
        List<User> users = User.find.all();

        return ok(
                index.render(users)
        );
    }

    public static Result create() {
        return ok(
                signup.render(form(User.class))
        );
    }

    public static Result save() {
        GroupedForm<User> form = form(User.class, User.SignUp.class).bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(signup.render(form));
        }

        User user = form.get();
        user.save();

        flash("success", "A new user has been created.");

        return redirect(
                routes.UserController.signIn()
        );
    }

    @Security.Authenticated(Secured.class)
    public static Result show(Long id) {
        User user = User.find.byId(id);

        if (user == null) {
            return notFound(
                    error404.render()
            );
        }

        GroupedForm<User> form = form(User.class).fill(user);

        return ok(
                edit.render(id, form)
        );
    }

    @Security.Authenticated(Secured.class)
    public static Result update(Long id) {
        GroupedForm<User> form = form(User.class, User.Update.class).bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(edit.render(id, form));
        }

        form.get().update(id);

        flash("success", "The user has been updated.");

        return redirect(
                routes.UserController.index()
        );
    }

    @Security.Authenticated(Secured.class)
    public static Result delete(Long id) {
        User user = User.find.ref(id);

        if (user == null) {
            return badRequest();
        }

        user.delete();

        flash("success", "The user has been deleted.");

        return redirect(
                routes.UserController.index()
        );
    }
*/

}
