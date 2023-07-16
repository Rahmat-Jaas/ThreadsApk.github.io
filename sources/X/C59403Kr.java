package X;

import android.app.AlertDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.3Kr  reason: invalid class name and case insensitive filesystem */
public final class C59403Kr {
    public static Object A01(AnonymousClass601 r13, C63893iY r14) {
        Button button;
        Button button2;
        Button button3;
        C04220Ms.A0B(r13, 0);
        FragmentActivity A05 = C63913ic.A05(r13);
        String A00 = AnonymousClass000.A00(79);
        AnonymousClass3HX r8 = r13.A00;
        C127397h3 A02 = C63893iY.A02(r14, 0);
        boolean z = r8.A03;
        int i = 16974394;
        if (z) {
            i = 16974374;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(A05, i).setMessage(C18220wO.A0o(A02));
        String A0N = A02.A0N(40);
        if (A0N != null) {
            Context context = message.getContext();
            int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, C18230wP.A0E(context));
            int applyDimension2 = (int) TypedValue.applyDimension(1, 18.0f, C18230wP.A0E(context));
            TextView textView = new TextView(context, (AttributeSet) null, 16842817);
            textView.setText(A0N);
            AnonymousClass3TV.A00(context, textView, A00);
            int i2 = -14277082;
            if (z) {
                i2 = -1;
            }
            textView.setTextColor(i2);
            textView.setPadding(applyDimension, applyDimension2, applyDimension, 0);
            message.setCustomTitle(textView);
        }
        C127397h3 A0K = A02.A0K(36);
        if (A0K != null) {
            message.setPositiveButton(A0K.A0O(36, ""), C18250wR.A0E(A0K, r8, r13, 0));
        }
        C127397h3 A0K2 = A02.A0K(38);
        if (A0K2 != null) {
            message.setNegativeButton(A0K2.A0O(36, ""), C18250wR.A0E(A0K2, r8, r13, 1));
        }
        C127397h3 A0K3 = A02.A0K(44);
        if (A0K3 != null) {
            message.setNeutralButton(A0K3.A0O(36, ""), C18250wR.A0E(A0K3, r8, r13, 2));
        }
        AlertDialog create = message.create();
        C13950oZ.A00(create);
        if (!(A0K == null || (button3 = create.getButton(-1)) == null)) {
            button3.setTextColor(A00(A0K, z));
        }
        if (!(A0K2 == null || (button2 = create.getButton(-2)) == null)) {
            button2.setTextColor(A00(A0K2, z));
        }
        if (!(A0K3 == null || (button = create.getButton(-3)) == null)) {
            button.setTextColor(A00(A0K3, z ? 1 : 0));
        }
        return null;
    }

    public static int A00(C127397h3 r2, int i) {
        r2.A0O(40, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        if (i != 0) {
            return -1;
        }
        return -16777216;
    }
}
