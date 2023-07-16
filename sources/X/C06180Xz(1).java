package X;

import java.nio.BufferOverflowException;
import java.nio.MappedByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Xz  reason: invalid class name and case insensitive filesystem */
public final class C06180Xz {
    public final AnonymousClass0O2 A00;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();

    public final void A00(AnonymousClass0MP r15, AnonymousClass0ND r16, String str) {
        String str2;
        String str3;
        Object[] objArr;
        String str4 = str;
        String A0V = AnonymousClass00U.A0V(r16.A00, "cadm_", r15.A00);
        if (AnonymousClass0O2.A01(A0V)) {
            AnonymousClass0O2 r10 = this.A00;
            AnonymousClass0O1 valueOf = AnonymousClass0O1.valueOf(A0V);
            synchronized (r10.A02) {
                try {
                    C06160Xx r8 = r10.A01;
                    MappedByteBuffer mappedByteBuffer = r8.A00;
                    int i = valueOf.A00;
                    Map map = r10.A04;
                    String str5 = valueOf.A01;
                    if (map.get(str5) == null) {
                        int length = str5.length();
                        int length2 = str4.length();
                        int i2 = length + length2 + 4;
                        int i3 = r8.A01;
                        int i4 = r10.A00;
                        if (i2 > i3 - i4) {
                            str2 = "lacrima";
                            str3 = "Cannot save mmapped value: %s";
                            objArr = new Object[]{valueOf};
                        } else {
                            map.put(str5, Integer.valueOf(i4));
                            r10.A03.put(str5, Integer.valueOf(i));
                            if (length2 > i) {
                                str4 = str4.substring(0, i);
                            }
                            AnonymousClass0O2.A00(valueOf, str4, mappedByteBuffer, r10.A00);
                            r10.A00 = mappedByteBuffer.position();
                            mappedByteBuffer.put("#".getBytes(AnonymousClass0O2.A06));
                        }
                    } else {
                        Integer num = (Integer) map.get(str5);
                        AnonymousClass0SJ.A00(num);
                        int intValue = num.intValue();
                        Integer num2 = (Integer) r10.A03.get(str5);
                        AnonymousClass0SJ.A00(num2);
                        int intValue2 = num2.intValue();
                        if (str4.length() > intValue2) {
                            str4 = str4.substring(0, intValue2);
                        }
                        if (str5.length() + str4.length() + 4 > r8.A01 - intValue) {
                            str2 = "lacrima";
                            str3 = "Cannot save mmapped value: %s";
                            objArr = new Object[]{valueOf};
                        } else {
                            AnonymousClass0O2.A00(valueOf, str4, mappedByteBuffer, intValue);
                        }
                    }
                    AnonymousClass0LU.A0O(str2, str3, objArr);
                } catch (BufferOverflowException e) {
                    C04790Pd.A00();
                    AnonymousClass0LU.A0L("lacrima", "Cannot save mmapped value: %s", e, valueOf);
                }
            }
            return;
        }
        this.A02.put(A0V, str4);
    }

    public C06180Xz(AnonymousClass0O2 r2) {
        this.A00 = r2;
    }
}
