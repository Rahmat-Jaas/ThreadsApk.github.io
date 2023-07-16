package X;

import android.util.Log;
import com.facebook.common.stringformat.StringFormatUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.0IW  reason: invalid class name */
public final class AnonymousClass0IW extends C08600dr {
    public final C05750Vs A00 = new C05750Vs();

    public final String A00() {
        boolean z;
        ArrayList arrayList;
        String formatStrLocaleSafe;
        C05750Vs r8 = this.A00;
        synchronized (r8) {
            z = false;
            if (r8.A00 == 0) {
                z = true;
            }
        }
        if (z) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        StringBuilder sb = new StringBuilder();
        synchronized (r8) {
            int i = r8.A00;
            arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                AnonymousClass0Vq[] r2 = r8.A03;
                arrayList.add(r2[(r8.A01 + i2) % r2.length]);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0Vq r5 = (AnonymousClass0Vq) it.next();
            try {
                Object obj = r5.A01;
                if (obj == null) {
                    formatStrLocaleSafe = r5.A04;
                } else {
                    Object obj2 = r5.A02;
                    if (obj2 == null) {
                        formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(r5.A04, obj);
                    } else {
                        Object obj3 = r5.A03;
                        if (obj3 == null) {
                            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(r5.A04, obj, obj2);
                        } else {
                            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(r5.A04, obj, obj2, obj3);
                        }
                    }
                }
                sb.append(simpleDateFormat.format(new Date(r5.A00)));
                sb.append(": [");
                sb.append(r5.A05);
                sb.append("] ");
                sb.append(formatStrLocaleSafe);
                sb.append("\n");
            } catch (RuntimeException e) {
                sb.append("Log format error: ");
                sb.append(e.getMessage());
                sb.append("; format string: ");
                sb.append(r5.A04);
                Log.e("ProfiloInternalRecorder", e.getMessage(), e);
            }
        }
        return sb.toString();
    }

    public final void A01(Object obj, Object obj2, Object obj3, String str, String str2) {
        C05750Vs r1 = this.A00;
        AnonymousClass0Vq r0 = new AnonymousClass0Vq("IgProfiloInitializer", "maybeTraceColdStartWithArgs(); Blackbox marker = %d, Sampling rate = %d, cfg_id = %d");
        r0.A01 = obj;
        r0.A02 = obj2;
        r0.A03 = obj3;
        r1.A00(r0);
    }

    public final void A02(Object obj, Object obj2, String str, String str2) {
        C05750Vs r1 = this.A00;
        AnonymousClass0Vq r0 = new AnonymousClass0Vq(str, str2);
        r0.A01 = obj;
        r0.A02 = obj2;
        r1.A00(r0);
    }

    public final void A03(Object obj, String str, String str2) {
        C05750Vs r1 = this.A00;
        AnonymousClass0Vq r0 = new AnonymousClass0Vq(str, str2);
        r0.A01 = obj;
        r1.A00(r0);
    }

    public final void A04(String str, String str2) {
        this.A00.A00(new AnonymousClass0Vq(str, str2));
    }
}
