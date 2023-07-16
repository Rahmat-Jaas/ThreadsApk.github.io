package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape173S0200000_1_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: X.11E  reason: invalid class name */
public final class AnonymousClass11E extends C41030Luu {
    public String A00;
    public final AnonymousClass1ZH A01;
    public final List A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        String str;
        String str2;
        String str3;
        TextView textView;
        Long l;
        Long l2;
        int i2 = m5o.mItemViewType;
        if (i2 == 0) {
            AnonymousClass137 r11 = (AnonymousClass137) m5o;
            String str4 = this.A00;
            if (str4 == null) {
                C18250wR.A0t(r11.A01);
                return;
            }
            String str5 = null;
            try {
                str5 = C18250wR.A0j(str4).toString(2);
            } catch (JSONException unused) {
            }
            TextView textView2 = r11.A01;
            if (!TextUtils.isEmpty(str5)) {
                str4 = str5;
            }
            textView2.setText(str4);
        } else if (i2 == 1) {
            C201813l r112 = (C201813l) m5o;
            C57183Ab r7 = (C57183Ab) this.A02.get(i - 1);
            Context A0B = C18240wQ.A0B(r112);
            C57833Cq r5 = r7.A02;
            AnonymousClass3GI r3 = r5.A02;
            List list = r3.A06;
            list.getClass();
            C28221tt r9 = (C28221tt) list.get(0);
            TextView textView3 = r112.A08;
            String str6 = r9.A09.A00;
            if (TextUtils.isEmpty(str6)) {
                str6 = "[Not set]";
            }
            textView3.setText(str6);
            TextView textView4 = r112.A04;
            String str7 = r3.A05;
            if (TextUtils.isEmpty(str7)) {
                str7 = "[Not set]";
            }
            textView4.setText(str7);
            TextView textView5 = r112.A06;
            C40337Lct lct = r7.A01;
            textView5.setText(AnonymousClass00U.A0R(lct.A00.name(), " - Priority ", r5.A00));
            C28231tu r0 = r9.A03;
            TextView textView6 = r112.A01;
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = "[Not set]";
            }
            textView6.setText(str);
            TextView textView7 = r112.A07;
            AnonymousClass3GI r1 = r5.A02;
            String arrays = Arrays.toString(lct.A01.toArray());
            StringBuilder A0s = C18190wL.A0s("QP contains triggers: ");
            List list2 = r1.A07;
            list2.getClass();
            A0s.append(Arrays.toString(list2.toArray()));
            StringBuilder A0r = C18200wM.A0r();
            C18240wQ.A1P("Surface requires triggers: ", arrays, A0r);
            A0r.append(10);
            textView7.setText(C18200wM.A0m(A0s, A0r));
            TextView textView8 = r112.A02;
            C568038p r02 = r5.A01;
            if (r02 == null || (l2 = r02.A01) == null) {
                str2 = "[Not set]";
            } else {
                str2 = DateUtils.formatDateTime(A0B, TimeUnit.SECONDS.toMillis(l2.longValue()), 17);
            }
            C568038p r03 = r5.A01;
            if (r03 == null || (l = r03.A00) == null) {
                str3 = "[Not set]";
            } else {
                str3 = DateUtils.formatDateTime(A0B, TimeUnit.SECONDS.toMillis(l.longValue()), 17);
            }
            textView8.setText(AnonymousClass00U.A0V(str2, " - ", str3));
            C62573aJ r2 = r7.A00;
            boolean z = r2.A02;
            TextView textView9 = r112.A05;
            if (z) {
                textView9.setText("Quick Promotion is qualified");
                C18180wK.A0s(A0B, textView9, R.color.qp_promotion_info_text);
                if (r2.A01 && (textView = r112.A03) != null) {
                    textView.setText(r2.A00);
                    C18180wK.A0s(A0B, textView, R.color.igds_error_or_destructive);
                }
            } else {
                textView9.setText(r2.A00);
                C18180wK.A0s(A0B, textView9, R.color.igds_error_or_destructive);
            }
            r112.itemView.setOnLongClickListener(new IDxCListenerShape173S0200000_1_I2(0, A0B, r5));
        } else {
            throw C18190wL.A0a("Unsupported ViewHolder type");
        }
    }

    public AnonymousClass11E(AnonymousClass1ZH r2, List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A02 = A0v;
        A0v.addAll(list);
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-1510469678);
        int size = this.A02.size() + 1;
        C14030oh.A0A(-137882247, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = C14030oh.A03(1896721254);
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        }
        C14030oh.A0A(1976336368, A03);
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.137} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.13l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.137} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.137} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.M5O onCreateViewHolder(android.view.ViewGroup r4, int r5) {
        /*
            r3 = this;
            android.view.LayoutInflater r2 = X.C18180wK.A0C(r4)
            r1 = 0
            if (r5 == 0) goto L_0x0022
            r0 = 1
            if (r5 != r0) goto L_0x003e
            r0 = 2131496454(0x7f0c0e06, float:1.8616473E38)
            android.view.View r0 = r2.inflate(r0, r4, r1)
            X.13l r2 = new X.13l
            r2.<init>(r0)
            android.view.View r1 = r2.A00
            r0 = 162(0xa2, float:2.27E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r2, r3, r0)
        L_0x001e:
            r1.setOnClickListener(r0)
            return r2
        L_0x0022:
            r0 = 2131496458(0x7f0c0e0a, float:1.8616481E38)
            android.view.View r0 = r2.inflate(r0, r4, r1)
            X.137 r2 = new X.137
            r2.<init>(r0)
            android.widget.TextView r1 = r2.A02
            r0 = 60
            X.AnonymousClass0wJ.A17(r1, r0, r2)
            android.widget.TextView r1 = r2.A00
            r0 = 59
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r2, r0)
            goto L_0x001e
        L_0x003e:
            java.lang.String r0 = "Unsupported item type"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11E.onCreateViewHolder(android.view.ViewGroup, int):X.M5O");
    }
}
