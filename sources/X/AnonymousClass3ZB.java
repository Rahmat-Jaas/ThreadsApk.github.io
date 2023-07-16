package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape6S0101000_1_I2;
import com.facebook.redex.IDxCListenerShape6S0201000_1_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;

/* renamed from: X.3ZB  reason: invalid class name */
public final class AnonymousClass3ZB {
    public static final C11630kW A0H = new C15720rm("ig_dialog_builder_module");
    public DialogInterface.OnClickListener A00;
    public C10300i6 A01;
    public final Context A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final CheckBox A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final I1U A0E;
    public final View A0F;
    public final ListView A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r5.getVisibility() == 0) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A00() {
        /*
            r9 = this;
            android.content.Context r1 = r9.A02
            boolean r0 = r1 instanceof android.app.Activity
            java.lang.String r6 = "IgDialogBuilder"
            if (r0 == 0) goto L_0x0015
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "Activity is finishing"
            X.C10450iM.A03(r6, r0)
        L_0x0015:
            android.view.View r3 = r9.A0F
            r2 = 8
            r8 = 0
            if (r3 == 0) goto L_0x0033
            android.widget.TextView r0 = r9.A0C
            if (r0 == 0) goto L_0x0033
            android.widget.TextView r1 = r9.A0B
            if (r1 == 0) goto L_0x0033
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b3
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00b3
            r3.setVisibility(r8)
        L_0x0033:
            android.widget.TextView r0 = r9.A0D
            if (r0 == 0) goto L_0x0064
            android.widget.TextView r3 = r9.A0A
            if (r3 == 0) goto L_0x0064
            android.view.View r0 = r9.A06
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L_0x0064
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            r0 = 76
            float r1 = (float) r0
            r0 = 1
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
            int r2 = (int) r0
            r3.setMinimumHeight(r2)
            r1 = 17
            r3.setGravity(r1)
            android.widget.CheckBox r0 = r9.A08
            r0.setMinimumHeight(r2)
            r0.setGravity(r1)
        L_0x0064:
            android.view.View r7 = r9.A06
            if (r7 == 0) goto L_0x00a6
            android.view.View r5 = r9.A05
            if (r5 == 0) goto L_0x00a6
            android.view.View r4 = r9.A03
            if (r4 == 0) goto L_0x00a6
            android.widget.TextView r3 = r9.A09
            if (r3 == 0) goto L_0x00a6
            android.widget.ListView r1 = r9.A0G
            if (r1 == 0) goto L_0x00a6
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00a6
            android.widget.ListAdapter r2 = r1.getAdapter()
            X.1fC r2 = (X.AnonymousClass1fC) r2
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x0091
            int r1 = r5.getVisibility()
            r0 = 1
            if (r1 != 0) goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            r2.mRoundDialogTopCorners = r0
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x00a1
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x00a1
            r8 = 1
        L_0x00a1:
            r2.mRoundDialogBottomCorners = r8
            r0 = 0
            r2.mShouldCenterText = r0
        L_0x00a6:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "Creating Dialog"
            X.AnonymousClass0LU.A0G(r6, r0, r1)
            X.I1U r0 = r9.A0E
            return r0
        L_0x00b3:
            r3.setVisibility(r2)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZB.A00():android.app.Dialog");
    }

    public final void A01(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A02.getString(i);
        TextView textView = this.A0B;
        textView.setText(string);
        textView.setOnClickListener(new IDxCListenerShape6S0201000_1_I2(-2, 5, onClickListener, this));
        textView.setVisibility(0);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void A02(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        AnonymousClass1fC r6 = new AnonymousClass1fC(this.A02, this.A01, A0H);
        this.A00 = onClickListener;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (int i = 0; i < charSequenceArr.length; i++) {
            AnonymousClass4MA.A02(new IDxCListenerShape6S0101000_1_I2(this, i, 6), charSequenceArr[i], A0v);
        }
        r6.addDialogMenuItems(A0v);
        ListView listView = this.A0G;
        listView.setAdapter(r6);
        listView.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZB(Context context) {
        this(context, R.layout.alert_dialog, C25296DjH.A03 ? R.style.IgDialog : R.style.IgDialogDeprecated);
        this.A0G.setVisibility(8);
        this.A0G.setBackground((Drawable) null);
        this.A0G.setLayoutDirection(3);
    }

    public AnonymousClass3ZB(Context context, int i, int i2) {
        this.A02 = context;
        I1U i1u = new I1U(context, i2);
        this.A0E = i1u;
        View A0E2 = C18240wQ.A0E(LayoutInflater.from(context), i);
        this.A04 = A0E2;
        i1u.setContentView(A0E2);
        this.A0G = (ListView) i1u.findViewById(16908298);
        this.A05 = i1u.findViewById(R.id.scrollView);
        this.A06 = i1u.findViewById(R.id.alertTitleContainer);
        this.A0D = (TextView) i1u.findViewById(R.id.alertTitle);
        this.A0A = (TextView) i1u.findViewById(R.id.message);
        this.A08 = (CheckBox) i1u.findViewById(R.id.messageCheckBox);
        this.A03 = i1u.findViewById(R.id.button_group);
        this.A0C = (TextView) i1u.findViewById(R.id.button_positive);
        this.A0B = (TextView) i1u.findViewById(R.id.button_negative);
        this.A0F = i1u.findViewById(R.id.button_divider);
        this.A09 = (TextView) i1u.findViewById(R.id.button_blue);
        this.A07 = (ViewGroup) i1u.findViewById(R.id.customViewHolder);
    }
}
