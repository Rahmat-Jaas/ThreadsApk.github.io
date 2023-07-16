package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.1li  reason: invalid class name and case insensitive filesystem */
public final class C25071li extends FR1 {
    public Bitmap A00;
    public final /* synthetic */ C29241xa A01;

    public final int getRunnableId() {
        return 290;
    }

    public C25071li(Bitmap bitmap, C29241xa r2) {
        this.A01 = r2;
        this.A00 = bitmap;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        C29241xa r0 = this.A01;
        Bitmap bitmap = this.A00;
        Context requireContext = r0.requireContext();
        AnonymousClass3C0 r5 = new AnonymousClass3C0(AnonymousClass0wJ.A0v(), 2);
        Context applicationContext = requireContext.getApplicationContext();
        File A002 = C14620pq.A00(r5.A03);
        Iterator it = r5.A04.iterator();
        while (it.hasNext()) {
            A002 = new File(A002, C18180wK.A0k(it));
        }
        A002.mkdirs();
        C83994sM A003 = AnonymousClass2CZ.A00(applicationContext, r5, A002, "ig_backup_code.jpg", "image/jpeg");
        try {
            C35062Ly.A00(Bitmap.CompressFormat.JPEG, bitmap, A003.BMO());
            A003.ADh();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void A02(Exception exc) {
        C63813iO.A04(2131821832);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        if (AnonymousClass0wJ.A1X(obj)) {
            C63813iO.A04(2131821829);
            AnonymousClass0wJ.A13(C18220wO.A0B(C08360dF.A00()), "has_backup_codes", true);
            return;
        }
        C63813iO.A04(2131821832);
    }

    public final void onFinish() {
        super.onFinish();
        C29241xa r1 = this.A01;
        r1.A04 = false;
        C18180wK.A11(r1);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
