package X;

import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.114  reason: invalid class name */
public final class AnonymousClass114 extends C41030Luu {
    public List A00 = AnonymousClass0wJ.A0v();
    public final C568838x A01;
    public final User A02;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005f, code lost:
        X.C18180wK.A0s(r5, r2, com.instagram.barcelona.R.color.igds_error_or_destructive);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        X.AnonymousClass0wJ.A18(r8.itemView, 168, r4, r7);
        r8.itemView.setTag(java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.M5O r8, int r9) {
        /*
            r7 = this;
            X.12I r8 = (X.AnonymousClass12I) r8
            java.util.List r0 = r7.A00
            java.lang.Object r4 = r0.get(r9)
            X.22s r4 = (X.C307422s) r4
            android.content.Context r5 = X.C18240wQ.A0B(r8)
            int r0 = r4.ordinal()
            r6 = 1
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x004d;
                case 2: goto L_0x0066;
                case 3: goto L_0x0027;
                case 4: goto L_0x006c;
                case 5: goto L_0x0072;
                case 6: goto L_0x0083;
                case 7: goto L_0x0089;
                default: goto L_0x0016;
            }
        L_0x0016:
            android.view.View r1 = r8.itemView
            r0 = 168(0xa8, float:2.35E-43)
            X.AnonymousClass0wJ.A18(r1, r0, r4, r7)
            android.view.View r1 = r8.itemView
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.setTag(r0)
            return
        L_0x0027:
            com.instagram.user.model.User r3 = r7.A02
            int r0 = r3.Apb()
            android.widget.TextView r2 = r8.A00
            if (r0 != r6) goto L_0x0040
            r1 = 2131830403(0x7f112683, float:1.9293802E38)
            java.lang.String r0 = r3.Ak1()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r5, r0, r1)
            r2.setText(r0)
            goto L_0x0016
        L_0x0040:
            r1 = 2131830402(0x7f112682, float:1.92938E38)
            goto L_0x008e
        L_0x0044:
            android.widget.TextView r2 = r8.A00
            r0 = 2131822369(0x7f110721, float:1.9277507E38)
            r2.setText(r0)
            goto L_0x005f
        L_0x004d:
            android.widget.TextView r2 = r8.A00
            r1 = 2131822370(0x7f110722, float:1.927751E38)
            com.instagram.user.model.User r0 = r7.A02
            java.lang.String r0 = r0.Ak1()
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r5, r0, r1)
            r2.setText(r0)
        L_0x005f:
            r0 = 2131100067(0x7f0601a3, float:1.7812505E38)
            X.C18180wK.A0s(r5, r2, r0)
            goto L_0x0016
        L_0x0066:
            android.widget.TextView r2 = r8.A00
            r1 = 2131834652(0x7f11371c, float:1.930242E38)
            goto L_0x008e
        L_0x006c:
            android.widget.TextView r2 = r8.A00
            r1 = 2131830405(0x7f112685, float:1.9293806E38)
            goto L_0x008e
        L_0x0072:
            android.widget.TextView r2 = r8.A00
            com.instagram.user.model.User r0 = r7.A02
            int r0 = r0.Apb()
            r1 = 2131837947(0x7f1143fb, float:1.9309103E38)
            if (r0 != r6) goto L_0x008e
            r1 = 2131837918(0x7f1143de, float:1.9309045E38)
            goto L_0x008e
        L_0x0083:
            android.widget.TextView r2 = r8.A00
            r1 = 2131832802(0x7f112fe2, float:1.9298668E38)
            goto L_0x008e
        L_0x0089:
            android.widget.TextView r2 = r8.A00
            r1 = 2131832800(0x7f112fe0, float:1.9298664E38)
        L_0x008e:
            r2.setText(r1)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass114.onBindViewHolder(X.M5O, int):void");
    }

    public AnonymousClass114(C568838x r2, User user) {
        this.A02 = user;
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1771161417);
        int size = this.A00.size();
        C14030oh.A0A(1679832569, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass12I(AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_reel_dashboard_actions_row));
    }
}
