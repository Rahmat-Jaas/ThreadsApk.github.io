package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0m0  reason: invalid class name and case insensitive filesystem */
public final class C12490m0 implements C14930qQ {
    public static final C10980jH A0E = C10980jH.A00();
    public C13620o0 A00;
    public final SharedPreferences A01;
    public final Handler A02;
    public final C13240nI A03;
    public final AnonymousClass0PW A04;
    public final Runnable A05;
    public final String A06;
    public final String A07;
    public final Queue A08 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final Context A0A;
    public final C13550nt A0B;
    public final C12310lg A0C;
    public final C16340ss A0D;

    public C12490m0(Context context, SharedPreferences sharedPreferences, C12310lg r13, AnonymousClass0PW r14, AnonymousClass0PW r15, C16340ss r16, String str, String str2, String str3, String str4) {
        this.A0A = context;
        this.A01 = sharedPreferences;
        this.A04 = r15;
        this.A07 = str4;
        this.A06 = str3;
        this.A0C = r13;
        this.A02 = new C12180lT(context.getMainLooper(), this);
        this.A05 = new C11820kr(this);
        String str5 = str;
        this.A0B = new C13550nt(context.getApplicationContext(), r13, str5);
        this.A03 = new C13240nI(context.getApplicationContext(), r13, r14, str5, str2);
        this.A0D = r16;
        if (this.A00 != null) {
            A00(this);
        }
        C13620o0 r4 = new C13620o0();
        r4.A04 = this.A06;
        r4.A05 = this.A07;
        String string = this.A01.getString("fb_uid", "");
        r4.A06 = TextUtils.isEmpty(string) ? "0" : string;
        r4.A03 = "567310203415052";
        r4.A02 = this.A04;
        this.A00 = r4;
    }

    public static void A00(C12490m0 r11) {
        String str;
        C13620o0 r4 = r11.A00;
        List list = r4.A07;
        if (!list.isEmpty()) {
            C13550nt r2 = r11.A0B;
            str = "failed to close writer";
            C12310lg r10 = r2.A00;
            r10.A00(new C14540pc("log_event_attempted", 1));
            File file = r2.A01;
            if (!file.exists() && !file.mkdir()) {
                AnonymousClass0LU.A0B("AnalyticsStorage", "Unable to open analytics storage.");
            }
            UUID uuid = r4.A08;
            if (uuid == null) {
                uuid = UUID.randomUUID();
                r4.A08 = uuid;
            }
            File file2 = new File(file, String.format((Locale) null, "%s_%d.batch", new Object[]{uuid.toString(), Integer.valueOf(r4.A00)}));
            if (file2.exists() && !file2.delete()) {
                AnonymousClass0LU.A0O("AnalyticsStorage", "File %s was not deleted", file2);
            }
            r4.A01 = System.currentTimeMillis();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF8");
                    try {
                        String obj = r4.toString();
                        outputStreamWriter.write(obj);
                        r10.A00(new C14540pc("log_event_file_size_in_bytes", (long) obj.length()));
                        r10.A00(new C14540pc("log_event_succeeded", 1));
                    } catch (IOException e) {
                        AnonymousClass0LU.A0H("AnalyticsStorage", "failed to write session to file", e);
                    } catch (Throwable th) {
                        try {
                            outputStreamWriter.close();
                            throw th;
                        } catch (IOException e2) {
                            AnonymousClass0LU.A0H("AnalyticsStorage", str, e2);
                            throw th;
                        }
                    }
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (UnsupportedEncodingException e4) {
                    AnonymousClass0LU.A0H("AnalyticsStorage", "UTF8 encoding is not supported", e4);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        str = "failed to close output stream";
                    }
                }
            } catch (FileNotFoundException e6) {
                AnonymousClass0LU.A0L("AnalyticsStorage", "Batch file creation failed %s", e6, file2);
            }
            list.clear();
            r4.A00++;
        }
        return;
        AnonymousClass0LU.A0H("AnalyticsStorage", str, e);
        list.clear();
        r4.A00++;
    }

    public static void A01(C12490m0 r3, Runnable runnable) {
        r3.A08.add(runnable);
        if (r3.A09.compareAndSet(false, true)) {
            A0E.execute(r3.A05);
        }
    }

    public final void reportEvent(C15170qr r5) {
        boolean z;
        C16340ss r3 = this.A0D;
        Map map = r5.A06;
        if (map.containsKey("l")) {
            z = Boolean.parseBoolean((String) map.get("l"));
        } else {
            SharedPreferences sharedPreferences = r3.A00;
            if (!sharedPreferences.getBoolean("LOG_ANALYTICS_EVENTS", false)) {
                z = sharedPreferences.getBoolean("is_employee", false);
            }
            A01(this, new C11700ke(r5, this));
        }
        if (!z) {
            return;
        }
        A01(this, new C11700ke(r5, this));
    }
}
