package X;

import com.facebook.common.mindeputils.ILogPart;

/* renamed from: X.0Og  reason: invalid class name and case insensitive filesystem */
public abstract class C04580Og extends AnonymousClass0EY implements ILogPart {
    public boolean A00;
    public Exception A01;
    public String A02;
    public boolean A03;

    public void A03(int i, int i2, Object obj, Object obj2) {
    }

    public abstract String A04();

    public void CZZ() {
        this.A03 = false;
        this.A02 = null;
        this.A01 = null;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return A01(this, true);
    }

    public final String toString() {
        try {
            return A01(this, false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public C04580Og(boolean z) {
        this(z, !z);
    }

    public static String A01(C04580Og r7, boolean z) {
        Exception e;
        String str;
        boolean z2;
        if (r7.A03) {
            e = r7.A01;
            if (!z || e == null) {
                String str2 = r7.A02;
                if (str2 == null) {
                    return "<NULL>";
                }
                return str2;
            }
        } else {
            e = null;
            try {
                str = r7.A04();
                z2 = true;
            } catch (Exception e2) {
                e = e2;
                Class<?> cls = r7.getClass();
                String name = cls.getName();
                String A0L = AnonymousClass00U.A0L("ToStr_", cls.getSimpleName());
                Object[] objArr = {name};
                if (A0L == null) {
                    A0L = "MinLogError";
                }
                AnonymousClass0K9.A01(6, A0L, String.format("Failed getting string from %s", objArr), e, 0);
                str = String.format("<Error calling %s >", new Object[]{name});
                z2 = false;
            }
            if (!z2 || str != null) {
                if (r7.A00) {
                    r7.A01 = e;
                    r7.A02 = str;
                    r7.A03 = true;
                }
                if (!z || e == null) {
                    return str;
                }
            } else {
                e = new IllegalStateException(String.format("%s.toStr() cannot return null", new Object[]{r7.getClass()}));
            }
        }
        throw e;
    }

    public C04580Og(boolean z, boolean z2) {
        super(z2);
        this.A02 = null;
        this.A01 = null;
        this.A03 = false;
        this.A00 = z;
    }

    public C04580Og() {
        this(true, false);
    }
}
