package com.instagram.notifications.badging.ui.viewmodel;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$shouldShowBadge$2", f = "BaseBadgeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseBadgeViewModel$shouldShowBadge$2 extends C39142Kno implements AnonymousClass0YM {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBadgeViewModel$shouldShowBadge$2(C146958n9 r2, boolean z) {
        super(3, r2);
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        boolean A1X2 = AnonymousClass0wJ.A1X(obj2);
        BaseBadgeViewModel$shouldShowBadge$2 baseBadgeViewModel$shouldShowBadge$2 = new BaseBadgeViewModel$shouldShowBadge$2((C146958n9) obj3, this.A02);
        baseBadgeViewModel$shouldShowBadge$2.A00 = A1X;
        baseBadgeViewModel$shouldShowBadge$2.A01 = A1X2;
        return baseBadgeViewModel$shouldShowBadge$2.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        AnonymousClass0OU.A00(obj);
        boolean z2 = this.A00;
        boolean z3 = this.A01;
        if (!z2 || (z3 && !this.A02)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
