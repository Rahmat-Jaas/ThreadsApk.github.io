package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import java.util.Arrays;

/* renamed from: X.1gh  reason: invalid class name and case insensitive filesystem */
public final class C23981gh extends AnonymousClass436 {
    public final Context A00;

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r5, Object obj, Object obj2) {
        int ordinal = ((AnonymousClass22V) obj).ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            r5.A5K(0);
        } else if (ordinal == 3) {
            r5.A5K(1);
        } else if (ordinal == 4) {
            r5.A5K(2);
        }
    }

    public C23981gh(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1 != 4) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r5, android.view.View r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            r0 = 2087493766(0x7c6ca086, float:4.9145514E36)
            int r3 = X.C14030oh.A03(r0)
            X.22V r7 = (X.AnonymousClass22V) r7
            r0 = 2131299802(0x7f090dda, float:1.8217616E38)
            android.view.View r2 = X.C18180wK.A0E(r6, r0)
            int r1 = r7.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x002e
            r0 = 1
            if (r1 == r0) goto L_0x0032
            r0 = 2
            if (r1 == r0) goto L_0x002a
            r0 = 3
            if (r1 == r0) goto L_0x002e
            r0 = 4
            if (r1 == r0) goto L_0x002e
        L_0x0023:
            r0 = 1310820842(0x4e2189ea, float:6.7754253E8)
            X.C14030oh.A0A(r0, r3)
            return
        L_0x002a:
            r0 = 2131233802(0x7f080c0a, float:1.8083752E38)
            goto L_0x0035
        L_0x002e:
            r0 = 2131100111(0x7f0601cf, float:1.7812594E38)
            goto L_0x0035
        L_0x0032:
            r0 = 2131233801(0x7f080c09, float:1.808375E38)
        L_0x0035:
            r2.setBackgroundResource(r0)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23981gh.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A03 = C14030oh.A03(1737036464);
        if (i == 0) {
            view = LayoutInflater.from(this.A00).inflate(R.layout.row_divider, viewGroup, false);
            i2 = 279650156;
        } else if (i == 1 || i == 2) {
            view = LayoutInflater.from(this.A00).inflate(R.layout.row_divider_dynamic_margin, viewGroup, false);
            i2 = 1513718453;
        } else {
            IllegalArgumentException A0a = C18190wL.A0a(AnonymousClass00U.A0J("viewType does not exist: ", i));
            C14030oh.A0A(1984022695, A03);
            throw A0a;
        }
        C14030oh.A0A(i2, A03);
        return view;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(C18210wN.A1X(i));
    }
}
