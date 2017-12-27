import android.util.Log;
import android.view.View;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ClickAspectJava {

    @After(value = "execution(* onClick(View)) && args(view)", argNames = "view")
    public void viewClick(View view) {
        Log.d("ClickAspectJava", "viewClick: " + view);
    }
}
