package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass68S;
import X.C04220Ms;
import X.C112826qG;
import X.C132487ty;
import X.C132507u0;
import X.C146958n9;
import X.C25599DoZ;
import X.C27219EgD;
import X.C39142Kno;
import X.C83224qz;
import X.C98596Ge;
import X.C98666Gl;
import X.C98726Gr;
import X.D0E;
import X.E5N;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape4S0210000_I2;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.LocalNotifsTestFragment$doPrediction$1", f = "LocalNotifsTestFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
public final class LocalNotifsTestFragment$doPrediction$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ List $candidates;
    public int label;
    public final /* synthetic */ LocalNotifsTestFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.dcp.LocalNotifsTestFragment$doPrediction$1$1", f = "LocalNotifsTestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.dcp.LocalNotifsTestFragment$doPrediction$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r5) {
            return new AnonymousClass1(A003, r5);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                IgTextView igTextView = LocalNotifsTestFragment.this.resultTextView;
                if (igTextView == null) {
                    C04220Ms.A0E("resultTextView");
                    throw null;
                }
                igTextView.setText(A003.toString());
                return Unit.A00;
            }
            throw AnonymousClass0wJ.A0a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalNotifsTestFragment$doPrediction$1(LocalNotifsTestFragment localNotifsTestFragment, List list, C146958n9 r4) {
        super(2, r4);
        this.this$0 = localNotifsTestFragment;
        this.$candidates = list;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new LocalNotifsTestFragment$doPrediction$1(this.this$0, this.$candidates, r5);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((LocalNotifsTestFragment$doPrediction$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            C132507u0 A00 = C98596Ge.A00(this.this$0.requireContext(), AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
            C132487ty A002 = C98726Gr.A00(this.this$0.requireContext(), AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
            C112826qG r3 = A00.A00;
            r3.A00(A00.A00());
            C98666Gl.A00(AnonymousClass68S.SIGNAL_STORE_COLLECT_ALL, A002.A00.A02, AnonymousClass4WJ.A0A(), "no_use_case", new KtLambdaShape4S0210000_I2(3, (Object) null, A002.A00, false));
            final List A003 = r3.A02.A00(this.$candidates, "notification_ranking");
            final LocalNotifsTestFragment localNotifsTestFragment = this.this$0;
            C27219EgD egD = ((E5N) localNotifsTestFragment.dispatcherProvider).A03;
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
