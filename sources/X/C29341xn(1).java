package X;

import android.content.Context;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;

/* renamed from: X.1xn  reason: invalid class name and case insensitive filesystem */
public final class C29341xn extends AnonymousClass1fC implements Filterable {
    public final List A00 = AnonymousClass0wJ.A0v();
    public final List A01 = AnonymousClass0wJ.A0v();
    public final List A02 = AnonymousClass0wJ.A0v();
    public final Context A03;
    public final Filter A04 = new C18910y9(this);

    public static final CharSequence A01(C29341xn r2, Object obj) {
        Context context;
        int i;
        if (obj instanceof C63293hC) {
            return ((C63293hC) obj).A04;
        }
        if (obj instanceof AnonymousClass4MC) {
            AnonymousClass4MC r3 = (AnonymousClass4MC) obj;
            CharSequence charSequence = r3.A0B;
            if (charSequence == null) {
                return AnonymousClass0wJ.A0k(r2.A03, r3.A04);
            }
            return charSequence;
        }
        if (obj instanceof C57573Bp) {
            context = r2.A03;
            i = ((C57573Bp) obj).A02;
        } else if (obj instanceof C63063bP) {
            context = r2.A03;
            i = ((C63063bP) obj).A02;
        } else if (obj instanceof C64533mV) {
            return ((C64533mV) obj).A03;
        } else {
            if (obj instanceof C62133Xg) {
                C62133Xg r32 = (C62133Xg) obj;
                CharSequence charSequence2 = r32.A05;
                if (charSequence2 != null) {
                    return charSequence2;
                }
                context = r2.A03;
                i = r32.A01;
            } else if (obj instanceof C62153Xk) {
                C62153Xk r33 = (C62153Xk) obj;
                CharSequence charSequence3 = r33.A05;
                if (charSequence3 != null) {
                    return charSequence3;
                }
                context = r2.A03;
                i = r33.A01;
            } else if (obj instanceof AnonymousClass4MA) {
                AnonymousClass4MA r34 = (AnonymousClass4MA) obj;
                CharSequence charSequence4 = r34.A05;
                if (charSequence4 != null) {
                    return charSequence4;
                }
                context = r2.A03;
                i = r34.A02;
            } else if (obj instanceof AnonymousClass3TL) {
                return ((AnonymousClass3TL) obj).A08;
            } else {
                if (!(obj instanceof AnonymousClass3T8)) {
                    return null;
                }
                AnonymousClass3T8 r35 = (AnonymousClass3T8) obj;
                Context context2 = r2.A03;
                int i2 = r35.A01;
                if (i2 != -1) {
                    return context2.getString(i2);
                }
                return r35.A04;
            }
        }
        return context.getString(i);
    }

    public final Filter getFilter() {
        return this.A04;
    }

    public C29341xn(Context context, C10300i6 r3, C11630kW r4) {
        super(context, r3, r4);
        this.A03 = context;
    }
}
