package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.7is  reason: invalid class name and case insensitive filesystem */
public final class C128097is implements C146928n6 {
    public final int A00;
    public final Object[] A01;

    public final CharSequence BEM(Context context) {
        int i = this.A00;
        if (i == 0) {
            return null;
        }
        ArrayList A0k = C18240wQ.A0k(r4);
        for (Object obj : this.A01) {
            if (obj instanceof C146928n6) {
                obj = ((C146928n6) obj).BEM(context);
            }
            A0k.add(obj);
        }
        Object[] array = A0k.toArray(new Object[0]);
        return context.getString(i, Arrays.copyOf(array, array.length));
    }

    public static C128097is A00(Object[] objArr, int i) {
        return new C128097is(objArr, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C128097is)) {
            return false;
        }
        C128097is r4 = (C128097is) obj;
        if (this.A00 != r4.A00 || !Arrays.equals(this.A01, r4.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("XMLStringResource(stringRes=");
        A0s.append(this.A00);
        A0s.append(", titleResArgs=");
        A0s.append(Arrays.toString(this.A01));
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C128097is(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
