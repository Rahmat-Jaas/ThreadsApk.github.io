package kotlin.coroutines.jvm.internal;

import X.C07530bf;
import X.C146958n9;
import X.C209216q;
import X.C27236EjA;
import X.C58593Gj;
import X.C62903b6;
import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.nux.aymh.viewmodel.AggregateAccountLoginHandler;
import java.util.Map;

public class KtCImplShape0S01101000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public final int A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S01101000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A0C = i;
        this.A03 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A0C;
        this.A0B = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        if (i != 0) {
            return ((AggregateAccountLoginHandler) this.A03).A01((KtCSuperShape0S1200000_I2) null, (C62903b6) null, (C209216q) null, (C58593Gj) null, (C07530bf) null, this);
        }
        return ContentFilterDictionaryRegistrar.A02((ContentFilterDictionaryRegistrar) this.A03, (Map) null, this);
    }
}
