package com.instagram.debug.devoptions;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass2CZ;
import X.AnonymousClass3C0;
import X.C14030oh;
import X.C14620pq;
import X.C18180wK;
import X.C37234Jn0;
import X.C83994sM;
import android.content.Context;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public final class PublicDeveloperOptions$addMainOptions$61 implements View.OnClickListener {
    public final /* synthetic */ Context $context;

    public PublicDeveloperOptions$addMainOptions$61(Context context) {
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1316606212);
        String A03 = C37234Jn0.A01().A04().A03();
        if (A03 != null) {
            Context context = this.$context;
            AnonymousClass3C0 r7 = new AnonymousClass3C0(AnonymousClass0wJ.A0v(), 4);
            Context applicationContext = context.getApplicationContext();
            File A00 = C14620pq.A00(r7.A03);
            Iterator it = r7.A04.iterator();
            while (it.hasNext()) {
                A00 = new File(A00, C18180wK.A0k(it));
            }
            A00.mkdirs();
            C83994sM A002 = AnonymousClass2CZ.A00(applicationContext, r7, A00, "dump.hprof", r7.A02);
            File file = new File(A03);
            try {
                A002.DBQ(new FileInputStream(file));
                A002.ADh();
            } catch (IOException e) {
                AnonymousClass0LU.A0E(PublicDeveloperOptions.TAG, "Error dumping hprof", e);
            } catch (Throwable th) {
                file.delete();
                C14030oh.A0C(1068648436, A05);
                throw th;
            }
            file.delete();
        } else {
            AnonymousClass0LU.A0B(PublicDeveloperOptions.TAG, "Could not dump hprof");
        }
        C14030oh.A0C(-50295817, A05);
    }
}
