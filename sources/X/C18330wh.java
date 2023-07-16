package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

/* renamed from: X.0wh  reason: invalid class name and case insensitive filesystem */
public final class C18330wh extends Dialog {
    public static C18330wh A00(Context context) {
        C18330wh r1 = new C18330wh(context);
        r1.A04(context.getString(2131830080));
        return r1;
    }

    public C18330wh(Context context) {
        super(context, R.style.IgDialog);
        setContentView(R.layout.progress_dialog);
        setCancelable(false);
    }

    public static C18330wh A01(Fragment fragment) {
        return new C18330wh(fragment.requireContext());
    }

    public static void A02(Context context, C18330wh r1, int i) {
        r1.A04(context.getString(i));
    }

    public static void A03(Fragment fragment, C18330wh r1, int i) {
        r1.A04(fragment.getString(i));
    }

    public final void A04(String str) {
        TextView textView = (TextView) findViewById(R.id.message);
        textView.setVisibility(0);
        textView.setText(str);
    }
}
