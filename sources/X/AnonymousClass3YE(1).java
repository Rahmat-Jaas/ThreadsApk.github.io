package X;

import android.content.Context;
import android.content.Intent;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3YE  reason: invalid class name */
public final class AnonymousClass3YE {
    public final AnonymousClass3Ub A00;
    public final AnonymousClass3Ub A01;
    public final AnonymousClass3XT A02;
    public final Pattern A03;

    public static boolean A00(Context context, Intent intent, Object obj, AnonymousClass3YE[] r12) {
        int length;
        if (r12 == null || (length = r12.length) <= 0) {
            return false;
        }
        int i = 0;
        do {
            AnonymousClass3YE r5 = r12[i];
            Pattern pattern = r5.A03;
            if (pattern == null || C18240wQ.A1V(C18220wO.A0q(obj), pattern)) {
                try {
                    C16050sO A002 = AnonymousClass0sB.A00(context, intent);
                    AnonymousClass3Ub r6 = r5.A00;
                    if (r6 != null) {
                        if (A002 != null) {
                            JSONObject A0y = C18230wP.A0y();
                            A0y.put("caller_uid", A002.A00);
                            String A012 = A002.A01();
                            if (A012 != null) {
                                A0y.put("caller_package_name", A012);
                            }
                            String str = A002.A02;
                            if (str != null) {
                                A0y.put("caller_version_name", str);
                            }
                            String str2 = A002.A01;
                            if (str2 != null) {
                                A0y.put("caller_domain", str2);
                            }
                            if (!r6.A01((Intent) null, A0y)) {
                            }
                        }
                    }
                    if (r5.A02(intent)) {
                        return true;
                    }
                } catch (JSONException unused) {
                }
            }
            i++;
        } while (i < length);
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (X.C62553aH.A01((X.C62553aH) r6.getValue(), r1) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.content.Intent r11) {
        /*
            r10 = this;
            r9 = 0
            if (r11 == 0) goto L_0x00a0
            r3 = 0
            X.374 r5 = X.AnonymousClass3JH.A01(r11)     // Catch:{ JSONException -> 0x009f }
            if (r5 != 0) goto L_0x000c
            r1 = r3
            goto L_0x000e
        L_0x000c:
            java.util.List r1 = r5.A00     // Catch:{ JSONException -> 0x009f }
        L_0x000e:
            X.3XT r4 = r10.A02     // Catch:{ JSONException -> 0x009f }
            if (r4 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x00a0
            boolean r0 = r1.isEmpty()     // Catch:{ JSONException -> 0x009f }
            if (r0 != 0) goto L_0x00a0
            java.util.Iterator r8 = r1.iterator()     // Catch:{ JSONException -> 0x009f }
        L_0x001e:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x009f }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r2 = r8.next()     // Catch:{ JSONException -> 0x009f }
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ JSONException -> 0x009f }
            java.util.Map r0 = r4.A00     // Catch:{ JSONException -> 0x009f }
            java.util.Iterator r7 = X.AnonymousClass0wJ.A0z(r0)     // Catch:{ JSONException -> 0x009f }
        L_0x0030:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x009f }
            if (r0 == 0) goto L_0x0088
            java.util.Map$Entry r6 = X.C18180wK.A0o(r7)     // Catch:{ JSONException -> 0x009f }
            java.lang.String r1 = X.C18200wM.A0p(r6)     // Catch:{ JSONException -> 0x009f }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x009f }
            switch(r0) {
                case -907987547: goto L_0x006d;
                case 3433509: goto L_0x0060;
                case 107944136: goto L_0x0053;
                case 1475610435: goto L_0x0046;
                default: goto L_0x0045;
            }     // Catch:{ JSONException -> 0x009f }
        L_0x0045:
            goto L_0x001e
        L_0x0046:
            java.lang.String r0 = "authority"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009f }
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r2.getAuthority()     // Catch:{ JSONException -> 0x009f }
            goto L_0x0079
        L_0x0053:
            java.lang.String r0 = "query"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009f }
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r2.getQuery()     // Catch:{ JSONException -> 0x009f }
            goto L_0x0079
        L_0x0060:
            java.lang.String r0 = "path"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009f }
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r2.getPath()     // Catch:{ JSONException -> 0x009f }
            goto L_0x0079
        L_0x006d:
            java.lang.String r0 = "scheme"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x009f }
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r2.getScheme()     // Catch:{ JSONException -> 0x009f }
        L_0x0079:
            if (r1 == 0) goto L_0x001e
            java.lang.Object r0 = r6.getValue()     // Catch:{ JSONException -> 0x009f }
            X.3aH r0 = (X.C62553aH) r0     // Catch:{ JSONException -> 0x009f }
            boolean r0 = X.C62553aH.A01(r0, r1)     // Catch:{ JSONException -> 0x009f }
            if (r0 != 0) goto L_0x0030
            goto L_0x001e
        L_0x0088:
            if (r5 == 0) goto L_0x008c
            org.json.JSONObject r3 = r5.A01     // Catch:{ JSONException -> 0x009f }
        L_0x008c:
            android.content.Intent r1 = r11.getSelector()     // Catch:{ JSONException -> 0x009f }
            X.3Ub r0 = r10.A01     // Catch:{ JSONException -> 0x009f }
            if (r0 == 0) goto L_0x009d
            if (r3 == 0) goto L_0x00a0
            boolean r0 = r0.A01(r1, r3)     // Catch:{ JSONException -> 0x009f }
            if (r0 != 0) goto L_0x009d
            return r9
        L_0x009d:
            r0 = 1
            return r0
        L_0x009f:
            return r9
        L_0x00a0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YE.A02(android.content.Intent):boolean");
    }

    public static AnonymousClass3YE[] A01(String str) {
        String str2;
        AnonymousClass3Ub r2;
        AnonymousClass3XT r1;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                AnonymousClass3YE[] r11 = new AnonymousClass3YE[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AnonymousClass3Ub r12 = null;
                    if (jSONObject.has("endpoint_name")) {
                        str2 = jSONObject.getString("endpoint_name");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has("caller_info")) {
                        r2 = AnonymousClass3Ub.A00(jSONObject.getJSONObject("caller_info"));
                    } else {
                        r2 = null;
                    }
                    if (jSONObject.has("uri_component")) {
                        r1 = AnonymousClass3XT.A00(jSONObject.getJSONObject("uri_component"));
                    } else {
                        r1 = null;
                    }
                    if (jSONObject.has("intent_field")) {
                        r12 = AnonymousClass3Ub.A00(jSONObject.getJSONObject("intent_field"));
                    }
                    r11[i] = new AnonymousClass3YE(r2, r12, r1, str2);
                }
                return r11;
            }
        } catch (JSONException unused) {
        }
        return new AnonymousClass3YE[0];
    }

    public AnonymousClass3YE(AnonymousClass3Ub r2, AnonymousClass3Ub r3, AnonymousClass3XT r4, String str) {
        Pattern compile;
        if (str == null) {
            compile = null;
        } else {
            compile = Pattern.compile(str, 32);
        }
        this.A03 = compile;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
