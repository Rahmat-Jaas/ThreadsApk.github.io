package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.instagram.barcelona.R;

/* renamed from: X.1QK  reason: invalid class name */
public abstract class AnonymousClass1QK extends AnonymousClass1QM {
    public Button A00;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            r0 = 2131297776(0x7f0905f0, float:1.8213506E38)
            r1 = 2131297776(0x7f0905f0, float:1.8213506E38)
            android.view.View r0 = X.AnonymousClass2CW.A00(r6, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r5.A00 = r0
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "btnCameraAccessAllow"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x001b:
            android.view.View r1 = X.AnonymousClass2CW.A00(r0, r1)
            r0 = 5
            X.AnonymousClass0wJ.A16(r1, r0, r5)
            r0 = 2131308530(0x7f092ff2, float:1.8235318E38)
            android.view.View r4 = X.AnonymousClass2CW.A00(r6, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r5 instanceof X.AnonymousClass1QD
            if (r0 == 0) goto L_0x0058
            r0 = 2131836025(0x7f113c79, float:1.9305205E38)
        L_0x0033:
            java.lang.CharSequence r1 = r5.getText(r0)
        L_0x0037:
            r4.setText(r1)
            r0 = 2131302265(0x7f091779, float:1.8222611E38)
            android.view.View r2 = r6.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x0057
            android.content.Context r1 = r5.requireContext()
            X.Hx4 r0 = r5.A00
            if (r0 == 0) goto L_0x0053
            r0 = 2131232268(0x7f08060c, float:1.808064E38)
            X.C18180wK.A0r(r1, r2, r0)
        L_0x0053:
            r0 = 6
            X.AnonymousClass0wJ.A16(r2, r0, r5)
        L_0x0057:
            return
        L_0x0058:
            boolean r0 = r5 instanceof X.AnonymousClass1QE
            if (r0 == 0) goto L_0x0060
            r0 = 2131835236(0x7f113964, float:1.9303605E38)
            goto L_0x0033
        L_0x0060:
            android.content.Context r0 = r5.requireContext()
            r3 = 2130970024(0x7f0405a8, float:1.7548746E38)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 1
            r1.resolveAttribute(r3, r2, r0)
            java.lang.CharSequence r1 = r2.string
            if (r1 == 0) goto L_0x007f
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x007f
            goto L_0x0037
        L_0x007f:
            r0 = 2131820620(0x7f11004c, float:1.927396E38)
            java.lang.CharSequence r1 = r5.getText(r0)
            X.C04220Ms.A06(r1)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QK.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(161117750);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_permissions_fragment, viewGroup, false);
        C14030oh.A09(-543807253, A02);
        return inflate;
    }
}
