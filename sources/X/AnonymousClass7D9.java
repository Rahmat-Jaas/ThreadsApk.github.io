package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TableRow;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.video.player.common.PhujiClientDebugDialog$lifecycleCallbacks$1;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7D9  reason: invalid class name */
public final class AnonymousClass7D9 {
    public static Context A00;
    public static View A01;
    public static WindowManager A02;
    public static final Application.ActivityLifecycleCallbacks A03 = new PhujiClientDebugDialog$lifecycleCallbacks$1();
    public static final AtomicBoolean A04 = C18230wP.A0w();

    public static final void A00() {
        View view = A01;
        if (view != null) {
            View findViewById = view.findViewById(R.id.watch_time_table_view);
            C04220Ms.A0C(findViewById, I17.A00(59));
            ((ViewGroup) findViewById).removeAllViews();
        }
    }

    public static final void A01(String str, String str2, String str3) {
        View view = A01;
        if (view != null) {
            View findViewById = view.findViewById(R.id.watch_time_table_view);
            C04220Ms.A0C(findViewById, I17.A00(59));
            ViewGroup viewGroup = (ViewGroup) findViewById;
            Context context = A00;
            if (context != null) {
                TextView textView = new TextView(context);
                textView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                textView.setPadding(20, 5, 0, 5);
                textView.setText(str);
                textView.setTextColor(-1);
                TextView textView2 = new TextView(context);
                textView2.setLayoutParams(new TableRow.LayoutParams(-2, -1));
                textView2.setPadding(20, 5, 0, 5);
                textView2.setText(str2);
                textView2.setTextColor(-1);
                TextView textView3 = new TextView(context);
                textView3.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                textView3.setPadding(20, 5, 0, 5);
                textView3.setText(str3);
                textView3.setTextColor(-1);
                TableRow tableRow = new TableRow(context);
                tableRow.addView(textView);
                tableRow.addView(textView2);
                tableRow.addView(textView3);
                viewGroup.addView(tableRow);
            }
        }
    }
}
