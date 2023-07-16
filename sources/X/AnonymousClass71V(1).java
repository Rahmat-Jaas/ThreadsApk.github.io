package X;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: X.71V  reason: invalid class name */
public final class AnonymousClass71V {
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0194, code lost:
        if (r1 == android.util.JsonToken.STRING) goto L_0x0196;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A00(android.content.Context r13, java.io.InputStream r14) {
        /*
            X.06f r5 = new X.06f
            r5.<init>()
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r14)
            android.util.JsonReader r6 = new android.util.JsonReader
            r6.<init>(r0)
            r6.beginArray()
        L_0x0012:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01cc
            android.os.Bundle r4 = X.C18180wK.A06()
            r6.beginObject()
            r3 = 0
        L_0x0020:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01c2
            java.lang.String r2 = r6.nextName()
            java.lang.String r1 = "name"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x003a
            java.lang.String r3 = r6.nextString()
            r4.putString(r1, r3)
            goto L_0x0020
        L_0x003a:
            java.lang.String r1 = "path"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = r6.nextString()
            r4.putString(r1, r0)
            goto L_0x0020
        L_0x004a:
            java.lang.String r9 = "navigationOptions"
            boolean r0 = r2.equals(r9)
            if (r0 == 0) goto L_0x01ac
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()
            r0 = 2131755061(0x7f100035, float:1.914099E38)
            java.lang.String r0 = com.facebook.fbreact.i18n.FbReactI18nModule.readLocalizedJSONFile(r13, r0)
            byte[] r0 = r0.getBytes()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0096 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0096 }
            android.util.JsonReader r7 = new android.util.JsonReader     // Catch:{ IOException -> 0x0096 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0096 }
            r7.beginObject()     // Catch:{ IOException -> 0x0096 }
        L_0x0073:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x0096 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = r7.nextName()     // Catch:{ IOException -> 0x0096 }
            android.util.JsonToken r1 = r7.peek()     // Catch:{ IOException -> 0x0096 }
            android.util.JsonToken r0 = android.util.JsonToken.STRING     // Catch:{ IOException -> 0x0096 }
            if (r1 == r0) goto L_0x0088
            r7.skipValue()     // Catch:{ IOException -> 0x0096 }
        L_0x0088:
            java.lang.String r0 = r7.nextString()     // Catch:{ IOException -> 0x0096 }
            r8.put(r2, r0)     // Catch:{ IOException -> 0x0096 }
            goto L_0x0073
        L_0x0090:
            r7.endObject()     // Catch:{ IOException -> 0x0096 }
            r7.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            android.os.Bundle r7 = X.C18180wK.A06()
            r6.beginObject()
        L_0x009d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.String r1 = r6.nextName()
            java.lang.String r2 = "title"
            boolean r0 = r1.equals(r2)
            r10 = 1
            if (r0 == 0) goto L_0x00ff
            android.util.JsonToken r1 = r6.peek()
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT
            if (r1 != r0) goto L_0x0192
            r6.beginObject()
            r11 = 0
            r1 = r11
        L_0x00bd:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r12 = r6.nextName()
            java.lang.String r0 = "text"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = r6.nextString()
            goto L_0x00bd
        L_0x00d4:
            java.lang.String r0 = "hashKey"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r11 = r6.nextString()
            goto L_0x00bd
        L_0x00e1:
            r6.skipValue()
            goto L_0x00bd
        L_0x00e5:
            boolean r0 = r8.containsKey(r11)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = X.C18220wO.A0r(r11, r8)
            int r0 = r1.length()
            int r0 = r0 - r10
            java.lang.String r1 = r1.substring(r10, r0)
        L_0x00f8:
            r7.putString(r2, r1)
            r6.endObject()
            goto L_0x009d
        L_0x00ff:
            java.lang.String r2 = "logoAsTitle"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x010f
            boolean r0 = r6.nextBoolean()
            r7.putBoolean(r2, r0)
            goto L_0x009d
        L_0x010f:
            java.lang.String r2 = "orientation"
            boolean r0 = r1.equals(r2)
            r11 = 0
            if (r0 == 0) goto L_0x0133
            java.lang.String r1 = r6.nextString()
            java.lang.String r0 = "PORTRAIT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "LANDSCAPE"
            boolean r0 = r1.equals(r0)
            r10 = -1
            if (r0 == 0) goto L_0x012e
            r10 = 0
        L_0x012e:
            r7.putInt(r2, r10)
            goto L_0x009d
        L_0x0133:
            java.lang.String r2 = "analyticsModule"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0196
            java.lang.String r2 = "perfLogger_ttiEventName"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0196
            java.lang.String r12 = "fb_analyticsExtras"
            boolean r0 = r1.equals(r12)
            if (r0 == 0) goto L_0x016c
            android.os.Bundle r2 = X.C18180wK.A06()
            r6.beginObject()
        L_0x0152:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0164
            java.lang.String r1 = r6.nextName()
            java.lang.String r0 = r6.nextString()
            r2.putString(r1, r0)
            goto L_0x0152
        L_0x0164:
            r6.endObject()
            r7.putParcelable(r12, r2)
            goto L_0x009d
        L_0x016c:
            java.lang.String r2 = "navigationBar"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x019f
            java.lang.String r1 = r6.nextString()
            java.lang.String r0 = "hidden"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0185
            r7.putBoolean(r2, r11)
            goto L_0x009d
        L_0x0185:
            java.lang.String r0 = "shown"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009d
            r7.putBoolean(r2, r10)
            goto L_0x009d
        L_0x0192:
            android.util.JsonToken r0 = android.util.JsonToken.STRING
            if (r1 != r0) goto L_0x019f
        L_0x0196:
            java.lang.String r0 = r6.nextString()
            r7.putString(r2, r0)
            goto L_0x009d
        L_0x019f:
            r6.skipValue()
            goto L_0x009d
        L_0x01a4:
            r6.endObject()
            r4.putBundle(r9, r7)
            goto L_0x0020
        L_0x01ac:
            java.lang.String r1 = "isFromRegistry"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r6.nextBoolean()
            r4.putBoolean(r1, r0)
            goto L_0x0020
        L_0x01bd:
            r6.skipValue()
            goto L_0x0020
        L_0x01c2:
            r6.endObject()
            if (r3 == 0) goto L_0x0012
            r5.put(r3, r4)
            goto L_0x0012
        L_0x01cc:
            r6.endArray()
            r6.close()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71V.A00(android.content.Context, java.io.InputStream):java.util.Map");
    }

    public static void A01(Bundle bundle, ReadableMap readableMap) {
        String string;
        Pattern compile = Pattern.compile("^<(\\S+)>$");
        Iterator A0x = C86144wL.A0x(bundle);
        while (A0x.hasNext()) {
            String A0k = C18180wK.A0k(A0x);
            Object obj = bundle.get(A0k);
            if (obj instanceof String) {
                String str = (String) obj;
                if (C18240wQ.A1V(str, compile) && (string = readableMap.getString(str.substring(1, str.length() - 1))) != null) {
                    bundle.putString(A0k, string);
                }
            }
        }
    }
}
