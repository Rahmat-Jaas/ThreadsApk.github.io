package X;

import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzp;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;
import java.util.Map;

/* renamed from: X.7Eu  reason: invalid class name */
public abstract class AnonymousClass7Eu {
    public static final Object A02(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        AnonymousClass8eM r3 = fastJsonResponse$Field.A00;
        if (r3 == null) {
            return obj;
        }
        StringToIntConverter stringToIntConverter = (StringToIntConverter) r3;
        Object obj2 = stringToIntConverter.A01.get(((Number) obj).intValue());
        if (obj2 != null || !stringToIntConverter.A02.containsKey("gms_unknown")) {
            return obj2;
        }
        return "gms_unknown";
    }

    public static final void A03(FastJsonResponse$Field fastJsonResponse$Field, Object obj, StringBuilder sb) {
        String obj2;
        int i = fastJsonResponse$Field.A02;
        if (i == 11) {
            Class cls = fastJsonResponse$Field.A08;
            C13320nQ.A01(cls);
            obj2 = cls.cast(obj).toString();
        } else if (i == 7) {
            obj2 = "\"";
            sb.append(obj2);
            sb.append(C1192173z.A00((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(obj2);
    }

    public final Object A04(FastJsonResponse$Field fastJsonResponse$Field) {
        if (this instanceof zzt) {
            zzt zzt = (zzt) this;
            int i = fastJsonResponse$Field.A03;
            if (i == 1) {
                return Integer.valueOf(zzt.A05);
            }
            if (i == 2) {
                return zzt.A01;
            }
            if (i == 3) {
                return Integer.valueOf(zzt.A00);
            }
            if (i == 4) {
                return zzt.A02;
            }
            throw C18180wK.A0a(C86104wH.A10("Unknown SafeParcelable id=", C86114wI.A0s(37), i));
        } else if (this instanceof zzs) {
            zzs zzs = (zzs) this;
            int i2 = fastJsonResponse$Field.A03;
            if (i2 == 1) {
                return Integer.valueOf(zzs.A04);
            }
            if (i2 == 2) {
                return zzs.A00;
            }
            if (i2 == 3) {
                return zzs.A01;
            }
            if (i2 == 4) {
                return zzs.A02;
            }
            throw C18180wK.A0a(C86104wH.A10("Unknown SafeParcelable id=", C86114wI.A0s(37), i2));
        } else if (this instanceof zzp) {
            zzp zzp = (zzp) this;
            int i3 = fastJsonResponse$Field.A03;
            switch (i3) {
                case 1:
                    return Integer.valueOf(zzp.A05);
                case 2:
                    return zzp.A00;
                case 3:
                    return zzp.A01;
                case 4:
                    return zzp.A02;
                case 5:
                    return zzp.A03;
                case 6:
                    return zzp.A04;
                default:
                    throw C18180wK.A0a(C86104wH.A10("Unknown SafeParcelable id=", C86114wI.A0s(37), i3));
            }
        } else if (this instanceof zzl) {
            zzl zzl = (zzl) this;
            int i4 = fastJsonResponse$Field.A03;
            if (i4 == 1) {
                return Integer.valueOf(zzl.A03);
            }
            if (i4 == 2) {
                return zzl.A01;
            }
            if (i4 == 4) {
                return zzl.A00;
            }
            throw C18180wK.A0a(C86104wH.A10("Unknown SafeParcelable id=", C86114wI.A0s(37), i4));
        } else {
            String str = fastJsonResponse$Field.A09;
            boolean z = ((FastSafeParcelableJsonResponse) this) instanceof SafeParcelResponse;
            if (fastJsonResponse$Field.A08 != null) {
                if (z) {
                    throw C86134wK.A0s("Converting to JSON does not require this method.");
                }
                try {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(substring) + 4);
                    A0s.append("get");
                    A0s.append(upperCase);
                    A0s.append(substring);
                    return C86114wI.A0g(this, getClass(), A0s.toString());
                } catch (Exception e) {
                    throw C86114wI.A0k(e);
                }
            } else if (!z) {
                return null;
            } else {
                throw C86134wK.A0s("Converting to JSON does not require this method.");
            }
        }
    }

    public final Map A05() {
        if (this instanceof SafeParcelResponse) {
            SafeParcelResponse safeParcelResponse = (SafeParcelResponse) this;
            zan zan = safeParcelResponse.A01;
            if (zan == null) {
                return null;
            }
            String str = safeParcelResponse.A02;
            C13320nQ.A01(str);
            return (Map) zan.A02.get(str);
        } else if (this instanceof zzt) {
            return zzt.A07;
        } else {
            if (this instanceof zzs) {
                return zzs.A06;
            }
            if (this instanceof zzp) {
                return zzp.A06;
            }
            return zzl.A05;
        }
    }

    public final boolean A06(FastJsonResponse$Field fastJsonResponse$Field) {
        if (this instanceof zzt) {
            return C86114wI.A1Z(((zzt) this).A06, fastJsonResponse$Field.A03);
        }
        if (this instanceof zzs) {
            return C86114wI.A1Z(((zzs) this).A05, fastJsonResponse$Field.A03);
        }
        if (this instanceof zzp) {
            return true;
        }
        if (this instanceof zzl) {
            return C86114wI.A1Z(((zzl) this).A04, fastJsonResponse$Field.A03);
        }
        if (fastJsonResponse$Field.A07 == 11) {
            if (fastJsonResponse$Field.A0A) {
                throw C86134wK.A0s("Concrete type arrays not supported");
            }
            throw C86134wK.A0s("Concrete types not supported");
        } else if (!(((FastSafeParcelableJsonResponse) this) instanceof SafeParcelResponse)) {
            return false;
        } else {
            throw C86134wK.A0s("Converting to JSON does not require this method.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r0 = android.util.Base64.encodeToString(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        r4.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r5 = r9.A05()
            r0 = 100
            java.lang.StringBuilder r4 = X.C86114wI.A0s(r0)
            java.util.Iterator r8 = X.C18220wO.A0x(r5)
        L_0x000e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.String r2 = X.C18180wK.A0k(r8)
            java.lang.Object r7 = r5.get(r2)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r7 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r7
            boolean r0 = r9.A06(r7)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r9.A04(r7)
            java.lang.Object r6 = A02(r7, r0)
            int r0 = r4.length()
            java.lang.String r3 = ","
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "{"
            r4.append(r0)
        L_0x0039:
            java.lang.String r1 = "\""
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = "\":"
            r4.append(r0)
            if (r6 != 0) goto L_0x004e
            java.lang.String r1 = "null"
        L_0x004a:
            r4.append(r1)
            goto L_0x000e
        L_0x004e:
            int r0 = r7.A07
            switch(r0) {
                case 8: goto L_0x007d;
                case 9: goto L_0x0086;
                case 10: goto L_0x0099;
                default: goto L_0x0053;
            }
        L_0x0053:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0079
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            java.lang.String r0 = "["
            r4.append(r0)
            int r2 = r6.size()
            r1 = 0
        L_0x0063:
            if (r1 >= r2) goto L_0x0076
            if (r1 <= 0) goto L_0x006a
            r4.append(r3)
        L_0x006a:
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x0073
            A03(r7, r0, r4)
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x0076:
            java.lang.String r1 = "]"
            goto L_0x004a
        L_0x0079:
            A03(r7, r6, r4)
            goto L_0x000e
        L_0x007d:
            r4.append(r1)
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x0097
            r0 = 0
            goto L_0x008f
        L_0x0086:
            r4.append(r1)
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x0097
            r0 = 10
        L_0x008f:
            java.lang.String r0 = android.util.Base64.encodeToString(r6, r0)
        L_0x0093:
            r4.append(r0)
            goto L_0x004a
        L_0x0097:
            r0 = 0
            goto L_0x0093
        L_0x0099:
            java.util.HashMap r6 = (java.util.HashMap) r6
            X.C32552Ch.A00(r4, r6)
            goto L_0x000e
        L_0x00a0:
            r4.append(r3)
            goto L_0x0039
        L_0x00a4:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x00b1
            java.lang.String r0 = "}"
        L_0x00ac:
            java.lang.String r0 = X.C18180wK.A0i(r0, r4)
            return r0
        L_0x00b1:
            java.lang.String r0 = "{}"
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Eu.toString():java.lang.String");
    }
}
