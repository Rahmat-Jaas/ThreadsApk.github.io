package X;

import android.text.TextUtils;
import android.widget.Filter;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0yA  reason: invalid class name and case insensitive filesystem */
public final class C18920yA extends Filter {
    public final AnonymousClass35S A00;
    public final /* synthetic */ C18900y5 A01;

    public static String A00(C84604tW r3, C18920yA r4, String str) {
        if (str != null) {
            try {
                AnonymousClass35S r1 = r4.A00;
                String A012 = A01(r3.B1L());
                C82724qA r12 = r1.A00;
                if (A02(r12, A012, str)) {
                    return r3.B1L();
                }
                if (A02(r12, A01(r3.AfO()), str)) {
                    return r3.AfO();
                }
                if (A02(r12, A01(r3.BK7()), str)) {
                    if (r3.CeI()) {
                        return r3.Ak1();
                    }
                    return r3.BK7();
                }
            } catch (RuntimeException e) {
                C10450iM.A03("Auto Complete User Adapter Subsequence Match", e.toString());
            }
        }
        return null;
    }

    public static boolean A02(C82724qA r11, String str, String str2) {
        String str3 = str2;
        int length = str2.length();
        if (length > str.length()) {
            return false;
        }
        if (length < 3 || AnonymousClass0hA.A0C(str, str3) || !r11.AJW()) {
            return AnonymousClass0hA.A0C(str, str3);
        }
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str3.toLowerCase(locale);
        int i = 0;
        if (!lowerCase2.isEmpty()) {
            int length2 = lowerCase2.length();
            int length3 = lowerCase.length();
            if (length2 > length3) {
                i = Integer.MAX_VALUE;
            } else {
                int[] iArr = new int[2];
                iArr[1] = length3;
                iArr[0] = length2;
                int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
                for (int i2 = 0; i2 < length2; i2++) {
                    for (int i3 = i2; i3 < length3; i3++) {
                        if (i2 == 0) {
                            int[] iArr3 = iArr2[i2];
                            if (i3 == 0) {
                                int i4 = 1;
                                if (lowerCase2.charAt(i2) == lowerCase.charAt(i3)) {
                                    i4 = 0;
                                }
                                iArr3[i3] = i4;
                            } else {
                                int i5 = iArr3[i3 - 1];
                                int i6 = 1;
                                if (lowerCase2.charAt(i2) == lowerCase.charAt(i3)) {
                                    i6 = 0;
                                }
                                iArr3[i3] = Math.min(i5, i6);
                            }
                        } else if (i2 == i3) {
                            int[] iArr4 = iArr2[i2];
                            char charAt = lowerCase2.charAt(i2);
                            char charAt2 = lowerCase.charAt(i3);
                            int i7 = iArr2[i2 - 1][i3 - 1];
                            if (charAt != charAt2) {
                                i7++;
                            }
                            iArr4[i3] = i7;
                        } else {
                            char charAt3 = lowerCase2.charAt(i2);
                            char charAt4 = lowerCase.charAt(i3);
                            int[] iArr5 = iArr2[i2];
                            int i8 = i3 - 1;
                            int i9 = iArr2[i2 - 1][i8];
                            if (charAt3 == charAt4) {
                                iArr5[i3] = i9;
                            } else {
                                iArr5[i3] = Math.min(i9 + 1, iArr5[i8]);
                            }
                        }
                    }
                }
                i = iArr2[length2 - 1][length3 - 1];
            }
        }
        if (((long) i) <= C63173fJ.A02(AnonymousClass0TJ.A05, 18580904695891959L).longValue()) {
            return true;
        }
        return false;
    }

    public C18920yA(AnonymousClass35S r1, C18900y5 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r7.A07.A0O(r2.BK2()) != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r9) {
        /*
            r8 = this;
            android.widget.Filter$FilterResults r6 = new android.widget.Filter$FilterResults
            r6.<init>()
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x001c
            X.0y5 r7 = r8.A01
            monitor-enter(r7)
            java.util.List r0 = r7.A09     // Catch:{ all -> 0x0019 }
            r5.addAll(r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r7)     // Catch:{ all -> 0x0019 }
            goto L_0x0058
        L_0x0019:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x001c:
            java.lang.String r0 = r9.toString()
            java.lang.String r4 = A01(r0)
            X.0y5 r7 = r8.A01
            monitor-enter(r7)
            java.util.List r0 = r7.A09     // Catch:{ all -> 0x0066 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0066 }
        L_0x002d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0066 }
            X.4tW r2 = (X.C84604tW) r2     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = A00(r2, r8, r4)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0050
            boolean r0 = r7.A02     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0050
            X.0BO r1 = r7.A07     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r2.BK2()     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.A0O(r0)     // Catch:{ all -> 0x0066 }
            r0 = 1
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 == 0) goto L_0x002d
            r5.add(r2)     // Catch:{ all -> 0x0066 }
            goto L_0x002d
        L_0x0057:
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
        L_0x0058:
            java.util.Comparator r0 = r7.A08
            java.util.Collections.sort(r5, r0)
            int r0 = r5.size()
            r6.count = r0
            r6.values = r5
            return r6
        L_0x0066:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18920yA.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        C18900y5 r1 = this.A01;
        Object obj = filterResults.values;
        if (obj == null) {
            list = Collections.emptyList();
        } else {
            list = (List) obj;
        }
        r1.A01 = list;
        if (charSequence == null) {
            charSequence = "";
        }
        r1.A00 = charSequence;
        if (!list.isEmpty()) {
            C14020og.A00(r1, -748582001);
        } else {
            C14020og.A01(r1, -308373175);
        }
    }

    public static String A01(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        return C18240wQ.A0g(charSequence.toString());
    }
}
