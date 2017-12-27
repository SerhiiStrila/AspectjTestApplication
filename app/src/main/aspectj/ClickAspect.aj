import android.util.Log;
import android.view.View;

public aspect ClickAspect {

    pointcut viewClick(View view): execution(* onClick(View)) && args(view);

    after(View view): viewClick(view) {
        Log.d("ClickAspect", "viewClick: " + view);
    }
}
