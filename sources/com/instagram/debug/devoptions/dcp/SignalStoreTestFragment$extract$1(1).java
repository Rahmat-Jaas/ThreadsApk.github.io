package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass68S;
import X.AnonymousClass791;
import X.C04220Ms;
import X.C132487ty;
import X.C146958n9;
import X.C25599DoZ;
import X.C27219EgD;
import X.C39142Kno;
import X.C83224qz;
import X.C98666Gl;
import X.D0E;
import X.E5N;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape4S1210000_I2;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$extract$1", f = "SignalStoreTestFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class SignalStoreTestFragment$extract$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ C132487ty $signalStoreObjWrapper;
    public int label;
    public final /* synthetic */ SignalStoreTestFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$extract$1$1", f = "SignalStoreTestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$extract$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r5) {
            return new AnonymousClass1(obj2, r5);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                TextView textView = SignalStoreTestFragment.this.responseText;
                if (textView == null) {
                    C04220Ms.A0E("responseText");
                    throw null;
                }
                textView.setText(obj2);
                return Unit.A00;
            }
            throw AnonymousClass0wJ.A0a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalStoreTestFragment$extract$1(C132487ty r2, SignalStoreTestFragment signalStoreTestFragment, C146958n9 r4) {
        super(2, r4);
        this.$signalStoreObjWrapper = r2;
        this.this$0 = signalStoreTestFragment;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new SignalStoreTestFragment$extract$1(this.$signalStoreObjWrapper, this.this$0, r5);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((SignalStoreTestFragment$extract$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            AnonymousClass791 r6 = this.$signalStoreObjWrapper.A00;
            final String obj2 = C98666Gl.A00(AnonymousClass68S.SIGNAL_STORE_EXTRACT, r6.A02, AnonymousClass0ZV.A00, "no_use_case", new KtLambdaShape4S1210000_I2(r6, (Object) null, "600000", 1, false)).toString();
            final SignalStoreTestFragment signalStoreTestFragment = this.this$0;
            C27219EgD egD = ((E5N) signalStoreTestFragment.dispatcherProvider).A03;
            AnonymousClass1 r0 = new AnonymousClass1((C146958n9) null);
            this.label = 1;
            if (C25599DoZ.A00(this, egD, r0) == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        return Unit.A00;
    }
}
