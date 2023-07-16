package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7e6  reason: invalid class name and case insensitive filesystem */
public final class C125827e6 implements C145788l5 {
    public final C147128nR A00;
    public final C03700Kj A01;
    public final C1197376r A02;

    /* JADX INFO: finally extract failed */
    public final List AQA() {
        ExampleContext exampleContext;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C1197376r r5 = this.A02;
        C147128nR r0 = this.A00;
        String BJq = r0.BJq();
        String BJs = r0.BJs();
        MAm A002 = Lv1.A00("\n        SELECT * FROM examples\n        WHERE use_case = ?\n        AND use_case_version = ?\n        ", 2);
        C86154wM.A1L(A002, BJq, 1);
        C86154wM.A1L(A002, BJs, 2);
        C41259M6w m6w = r5.A01;
        m6w.assertNotSuspendingTransaction();
        Cursor query = m6w.query((C145148jv) A002, (CancellationSignal) null);
        try {
            int A012 = C116106wR.A01(query, "id");
            int A013 = C116106wR.A01(query, AnonymousClass000.A00(878));
            int A014 = C116106wR.A01(query, "use_case");
            int A015 = C116106wR.A01(query, "use_case_version");
            int A016 = C116106wR.A01(query, "model_version");
            int A017 = C116106wR.A01(query, "label");
            int A018 = C116106wR.A01(query, "features");
            int A019 = C116106wR.A01(query, "timestamp");
            int A0110 = C116106wR.A01(query, AnonymousClass000.A00(974));
            int A0111 = C116106wR.A01(query, "context");
            ArrayList<C89885Hk> A0k = C18240wQ.A0k(query.getCount());
            while (query.moveToNext()) {
                int i = query.getInt(A012);
                if (query.isNull(A013)) {
                    str = null;
                } else {
                    str = query.getString(A013);
                }
                if (query.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A014);
                }
                if (query.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A015);
                }
                long j = query.getLong(A016);
                long j2 = query.getLong(A017);
                if (query.isNull(A018)) {
                    str4 = null;
                } else {
                    str4 = query.getString(A018);
                }
                long j3 = query.getLong(A019);
                long j4 = query.getLong(A0110);
                if (query.isNull(A0111)) {
                    str5 = null;
                } else {
                    str5 = query.getString(A0111);
                }
                A0k.add(new C89885Hk(str, str2, str3, str4, str5, i, j, j2, j3, j4));
            }
            query.close();
            A002.A00();
            ArrayList A0w = AnonymousClass0wJ.A0w(A0k);
            for (C89885Hk r3 : A0k) {
                String str6 = r3.A06;
                String str7 = r3.A05;
                if (str7.length() == 0) {
                    exampleContext = ExampleContext.A05;
                } else {
                    exampleContext = new ExampleContext((Type) null, str7, 30);
                }
                C39237Kq4 kq4 = C36975Ji8.A03;
                HashMap hashMap = (HashMap) kq4.A00(r3.A07, AnonymousClass72C.A00(C03970Ls.A01(HashMap.class, C86154wM.A16(String.class), C86154wM.A16(FeatureData.class)), kq4.A02));
                long j5 = r3.A00;
                Type type = Type.LONG;
                hashMap.put("2474", new FeatureData(type, "2474", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, j5, false));
                hashMap.put("100001", new FeatureData(type, "100001", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, r3.A03, false));
                hashMap.put("100002", new FeatureData(type, "100002", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, r3.A01, false));
                A0w.add(new Example(exampleContext, str6, hashMap));
            }
            return A0w;
        } catch (Throwable th) {
            query.close();
            A002.A00();
            throw th;
        }
    }

    public final void CbR() {
        C1197376r r1 = this.A02;
        C147128nR r0 = this.A00;
        String BJq = r0.BJq();
        String BJs = r0.BJs();
        C41259M6w m6w = r1.A01;
        m6w.assertNotSuspendingTransaction();
        AnonymousClass7JN r2 = r1.A02;
        C28051Exi acquire = r2.acquire();
        C86144wL.A1F(acquire, BJq, 1);
        C86144wL.A1F(acquire, BJs, 2);
        m6w.beginTransaction();
        try {
            acquire.AKx();
            m6w.setTransactionSuccessful();
        } finally {
            m6w.endTransaction();
            r2.release(acquire);
        }
    }

    public final void CwH(List list) {
        C1197376r r1 = this.A02;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Example example = (Example) it.next();
            String str = example.A01;
            C147128nR r3 = this.A00;
            String BJq = r3.BJq();
            String BJs = r3.BJs();
            long AwF = r3.AwF();
            C39237Kq4 kq4 = C36975Ji8.A03;
            A0w.add(new C89885Hk(str, BJq, BJs, kq4.A01(example.A02, AnonymousClass72C.A00(C03970Ls.A01(HashMap.class, C86154wM.A16(String.class), C86154wM.A16(FeatureData.class)), kq4.A02)), example.A00.A01, 0, AwF, -1, System.currentTimeMillis(), 0));
        }
        C41259M6w m6w = r1.A01;
        m6w.assertNotSuspendingTransaction();
        m6w.beginTransaction();
        try {
            r1.A00.insert((Iterable) A0w);
            m6w.setTransactionSuccessful();
        } finally {
            m6w.endTransaction();
        }
    }

    public C125827e6(C03700Kj r2, C1197376r r3, C147128nR r4) {
        AnonymousClass0wJ.A1O(r3, r4);
        C04220Ms.A0B(r2, 3);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r2;
    }
}
