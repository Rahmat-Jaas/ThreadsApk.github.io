package X;

import com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0w3  reason: invalid class name and case insensitive filesystem */
public final class C18060w3 implements Runnable {
    public final List A00;
    public final /* synthetic */ C02970Dp A01;

    public C18060w3(C02970Dp r3) {
        this.A01 = r3;
        List list = r3.A07;
        synchronized (list) {
            this.A00 = new ArrayList(list);
            list.clear();
        }
    }

    public final void run() {
        Object[] objArr;
        String str;
        Socket socket;
        String trim;
        Class<C18060w3> cls = C18060w3.class;
        List<C18070w4> list = this.A00;
        if (!list.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (C18070w4 r6 : list) {
                    JSONObject jSONObject = new JSONObject();
                    int i = 0;
                    while (true) {
                        List list2 = r6.A06;
                        if (i >= list2.size()) {
                            break;
                        }
                        jSONObject.put((String) list2.get(i), list2.get(i + 1));
                        i += 2;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    Map map = r6.A08;
                    for (String str2 : map.keySet()) {
                        jSONObject2.put(str2, map.get(str2));
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    Map map2 = r6.A09;
                    for (String str3 : map2.keySet()) {
                        jSONObject3.put(str3, map2.get(str3));
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("id", r6.A01);
                    jSONObject4.put("event", r6.A04);
                    jSONObject4.put("action", r6.A03);
                    jSONObject4.put("timestamp", r6.A02);
                    jSONObject4.put("duration", r6.A00);
                    jSONObject4.put("metadata", jSONObject2);
                    jSONObject4.put("points", jSONObject3);
                    jSONObject4.put("tags", r6.A07);
                    jSONObject4.put("extra", jSONObject);
                    jSONObject4.put("process_name", r6.A05);
                    jSONArray.put(jSONObject4);
                }
                C02970Dp r62 = this.A01;
                socket = new Socket("localhost", r62.A00);
                new PrintWriter(socket.getOutputStream(), true).println(jSONArray.toString());
                AnonymousClass0LU.A09(cls, "Sent %d events.", Integer.valueOf(list.size()));
                if (r62.A04) {
                    String readLine = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                    if (readLine == null) {
                        trim = "";
                    } else {
                        trim = readLine.trim();
                    }
                    if (!IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL.equals(trim)) {
                        AnonymousClass0LU.A08(cls, "Recieving QPL event were not confirmed. Response: `%s`", trim);
                    } else {
                        AnonymousClass0LU.A02(cls, "Recieved confirmation.");
                    }
                }
                socket.close();
            } catch (JSONException e) {
                e = e;
                objArr = new Object[0];
                str = "Unable to construct JSON record.";
                AnonymousClass0LU.A05(cls, str, e, objArr);
            } catch (IOException e2) {
                e = e2;
                objArr = new Object[0];
                str = "Unable to write record to socket.";
                AnonymousClass0LU.A05(cls, str, e, objArr);
            } catch (Throwable th) {
                socket.close();
                throw th;
            }
        }
    }
}
