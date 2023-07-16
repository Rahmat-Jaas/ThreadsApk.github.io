package X;

/* renamed from: X.6W6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6W6 {
    public static final long A00(String str, long j, long j2, long j3) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long A02 = AnonymousClass4n2.A02(property);
                if (A02 != null) {
                    long longValue = A02.longValue();
                    if (j2 <= longValue && longValue <= j3) {
                        return longValue;
                    }
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append("System property '");
                    A0r.append(str);
                    A0r.append("' should be in range ");
                    A0r.append(j2);
                    A0r.append("..");
                    A0r.append(j3);
                    A0r.append(", but is '");
                    A0r.append(longValue);
                    throw C18180wK.A0a(C86114wI.A0q(A0r, '\''));
                }
                throw C18180wK.A0a(AnonymousClass00U.A0e("System property '", str, "' has unrecognized value '", property, '\''));
            }
        } catch (SecurityException unused) {
        }
        return j;
    }
}
