package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.facebook.redex.IDxSProviderShape515S0100000_2_I2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7En  reason: invalid class name and case insensitive filesystem */
public final class C121177En {
    public static final Class[] A05;
    public final C015106z A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final C86094wG A01(String str) {
        Map map = this.A01;
        Object obj = map.get(str);
        if (obj == null) {
            Map map2 = this.A03;
            if (!map2.containsKey(str)) {
                map2.put(str, (Object) null);
            }
            Object obj2 = map2.get(str);
            if (obj2 == null) {
                obj2 = DIV.A01;
            }
            obj = C18190wL.A0z(obj2);
            map.put(str, obj);
            map.put(str, obj);
        }
        return C18230wP.A0x((C148838sG) null, (C86094wG) obj);
    }

    public final void A02(String str, Object obj) {
        M5J m5j;
        C04220Ms.A0B(str, 0);
        if (obj != null) {
            Class[] clsArr = A05;
            int length = clsArr.length;
            int i = 0;
            while (i < length) {
                Class cls = clsArr[i];
                C04220Ms.A0A(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            }
            StringBuilder A0s = C18190wL.A0s("Can't put value with type ");
            A0s.append(obj.getClass());
            throw C18190wL.A0a(C18180wK.A0i(" into saved state", A0s));
        }
        Object obj2 = this.A02.get(str);
        if (!(obj2 instanceof C880856r) || (m5j = (M5J) obj2) == null) {
            this.A03.put(str, obj);
        } else {
            m5j.A0H(obj);
        }
        C86074wE r0 = (C86074wE) this.A01.get(str);
        if (r0 != null) {
            r0.CrC(obj);
        }
    }

    static {
        Class[] clsArr = new Class[29];
        System.arraycopy(new Class[]{Size.class, SizeF.class}, C18200wM.A1a(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class}, clsArr) ? 1 : 0, clsArr, 27, 2);
        A05 = clsArr;
    }

    public final Object A00(String str) {
        try {
            return this.A03.get(str);
        } catch (ClassCastException unused) {
            this.A03.remove(str);
            C880656p r1 = (C880656p) this.A02.remove(str);
            if (r1 != null) {
                r1.A00 = null;
            }
            this.A01.remove(str);
            return null;
        }
    }

    public C121177En(Map map) {
        LinkedHashMap A0y = C18220wO.A0y();
        this.A03 = A0y;
        this.A04 = C18220wO.A0y();
        this.A02 = C18220wO.A0y();
        this.A01 = C18220wO.A0y();
        this.A00 = new IDxSProviderShape515S0100000_2_I2(this, 1);
        A0y.putAll(map);
    }

    public C121177En() {
        this.A03 = C18220wO.A0y();
        this.A04 = C18220wO.A0y();
        this.A02 = C18220wO.A0y();
        this.A01 = C18220wO.A0y();
        this.A00 = new IDxSProviderShape515S0100000_2_I2(this, 1);
    }
}
