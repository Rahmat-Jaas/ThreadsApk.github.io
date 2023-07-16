package X;

import android.util.Base64;
import ch.boye.httpclientandroidlib.client.utils.URLEncodedUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.0pM  reason: invalid class name and case insensitive filesystem */
public final class C14410pM {
    public final C14050oj A00;
    public final String A01;
    public final String A02;

    public final int A00(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("format", "json");
        hashMap.put("access_token", this.A01);
        if (str == null) {
            try {
                AnonymousClass0LU.A0C("AnalyticsHttpClient", "Json data cannot be null");
            } catch (IOException e) {
                AnonymousClass0LU.A0F("AnalyticsHttpClient", "Unable to compress message to Json object, using original message", e);
                hashMap.put(DialogModule.KEY_MESSAGE, str);
            }
        }
        byte[] bytes = str.getBytes("UTF-8");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        hashMap.put(DialogModule.KEY_MESSAGE, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        hashMap.put("compressed", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        C14050oj r0 = this.A00;
        String str4 = this.A02;
        int i = -1;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) r0.A00.get()).openConnection();
                httpURLConnection.setConnectTimeout(10000);
                try {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    httpURLConnection.setRequestProperty("User-Agent", str4);
                    httpURLConnection.setRequestProperty("X-FB-HTTP-Engine", "MQTT Analytics");
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(C13770oH.A01(httpURLConnection, 133641169));
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (sb.length() != 0) {
                                sb.append(URLEncodedUtils.PARAMETER_SEPARATOR);
                            }
                            try {
                                sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                                sb.append("=");
                                sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                            } catch (UnsupportedEncodingException e2) {
                                AnonymousClass0LU.A0F("AnalyticsService", "", e2);
                                dataOutputStream.close();
                                httpURLConnection.disconnect();
                                return i;
                            }
                        }
                        try {
                            dataOutputStream.writeBytes(sb.toString());
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            i = httpURLConnection.getResponseCode();
                        } catch (IOException e3) {
                            AnonymousClass0LU.A0F("AnalyticsService", "Failed to write to output stream", e3);
                        } catch (Throwable th) {
                            dataOutputStream.close();
                            throw th;
                        }
                    } catch (IOException | SecurityException e4) {
                        AnonymousClass0LU.A0F("AnalyticsService", "Unable to create output stream", e4);
                    }
                } catch (IOException e5) {
                    try {
                        AnonymousClass0LU.A0F("AnalyticsService", "", e5);
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                }
                httpURLConnection.disconnect();
                return i;
            } catch (IOException e6) {
                e = e6;
                str2 = "AnalyticsService";
                str3 = "Failed to open http connection";
                AnonymousClass0LU.A0F(str2, str3, e);
                return -1;
            }
        } catch (MalformedURLException e7) {
            e = e7;
            str2 = "AnalyticsService";
            str3 = "Logging end point malformed";
            AnonymousClass0LU.A0F(str2, str3, e);
            return -1;
        }
    }

    public C14410pM(C14050oj r1, String str, String str2) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = str2;
    }
}
