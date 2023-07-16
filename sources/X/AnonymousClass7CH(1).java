package X;

/* renamed from: X.7CH  reason: invalid class name */
public final class AnonymousClass7CH {
    public static final String[] A00 = new String[128];

    static {
        String[] strArr;
        int i = 0;
        do {
            strArr = A00;
            strArr[i] = String.format("\\u%04x", C18210wN.A1X(i));
            i++;
        } while (i <= 31);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        strArr[60] = "\\u003c";
        strArr[62] = "\\u003e";
        strArr[38] = "\\u0026";
        strArr[61] = "\\u003d";
        strArr[39] = "\\u0027";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(java.lang.Object r5) {
        /*
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto L_0x0029
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            org.json.JSONObject r4 = X.C18230wP.A0y()
            java.util.Iterator r3 = r5.keys()
        L_0x000e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = X.C18180wK.A0k(r3)     // Catch:{ JSONException -> 0x000e }
            r0 = 1
            java.lang.String r1 = A01(r2, r0)     // Catch:{ JSONException -> 0x000e }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ JSONException -> 0x000e }
            java.lang.Object r0 = A00(r0)     // Catch:{ JSONException -> 0x000e }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x000e }
            goto L_0x000e
        L_0x0029:
            boolean r0 = r5 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0049
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            org.json.JSONArray r4 = X.C18250wR.A0i()
            r1 = 0
        L_0x0034:
            int r0 = r5.length()
            if (r1 >= r0) goto L_0x0048
            java.lang.Object r0 = r5.get(r1)     // Catch:{ JSONException -> 0x0045 }
            java.lang.Object r0 = A00(r0)     // Catch:{ JSONException -> 0x0045 }
            r4.put(r0)     // Catch:{ JSONException -> 0x0045 }
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x0048:
            return r4
        L_0x0049:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x005a
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x005a
            java.lang.String r1 = r5.toString()
            r0 = 1
            java.lang.String r5 = A01(r1, r0)
        L_0x005a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CH.A00(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(java.lang.String r5, boolean r6) {
        /*
            java.lang.StringBuilder r4 = X.C18200wM.A0r()
            int r3 = r5.length()
            r2 = 0
        L_0x0009:
            if (r2 >= r3) goto L_0x003a
            char r1 = r5.charAt(r2)
            r0 = 92
            if (r1 != r0) goto L_0x001d
            if (r6 == 0) goto L_0x002f
            java.lang.String r0 = "\\\\\\\\"
        L_0x0017:
            r4.append(r0)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x001d:
            r0 = 128(0x80, float:1.794E-43)
            if (r1 < r0) goto L_0x002f
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L_0x0028
            java.lang.String r0 = "\\u2028"
            goto L_0x0017
        L_0x0028:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L_0x0035
            java.lang.String r0 = "\\u2029"
            goto L_0x0017
        L_0x002f:
            java.lang.String[] r0 = A00
            r0 = r0[r1]
            if (r0 != 0) goto L_0x0017
        L_0x0035:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x0017
        L_0x003a:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CH.A01(java.lang.String, boolean):java.lang.String");
    }
}
