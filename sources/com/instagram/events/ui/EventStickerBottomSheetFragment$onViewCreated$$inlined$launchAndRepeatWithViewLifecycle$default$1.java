package com.instagram.events.ui;

import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass1YL;
import X.AnonymousClass3J4;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.D0E;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsImageCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S01400000_I2;

@DebugMetadata(c = "com.instagram.events.ui.EventStickerBottomSheetFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "EventStickerBottomSheetFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class EventStickerBottomSheetFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewGroup A03;
    public final /* synthetic */ AnonymousClass061 A04;
    public final /* synthetic */ AnonymousClass066 A05;
    public final /* synthetic */ IgTextView A06;
    public final /* synthetic */ IgTextView A07;
    public final /* synthetic */ IgImageView A08;
    public final /* synthetic */ IgImageView A09;
    public final /* synthetic */ IgImageView A0A;
    public final /* synthetic */ AnonymousClass1YL A0B;
    public final /* synthetic */ IgdsBottomButtonLayout A0C;
    public final /* synthetic */ IgdsImageCell A0D;
    public final /* synthetic */ IgdsListCell A0E;
    public final /* synthetic */ IgdsListCell A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventStickerBottomSheetFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(View view, View view2, ViewGroup viewGroup, AnonymousClass061 r6, AnonymousClass066 r7, IgTextView igTextView, IgTextView igTextView2, IgImageView igImageView, IgImageView igImageView2, IgImageView igImageView3, AnonymousClass1YL r13, IgdsBottomButtonLayout igdsBottomButtonLayout, IgdsImageCell igdsImageCell, IgdsListCell igdsListCell, IgdsListCell igdsListCell2, C146958n9 r18) {
        super(2, r18);
        this.A05 = r7;
        this.A04 = r6;
        this.A0B = r13;
        this.A01 = view;
        this.A02 = view2;
        this.A0D = igdsImageCell;
        this.A06 = igTextView;
        this.A08 = igImageView;
        this.A0F = igdsListCell;
        this.A0E = igdsListCell2;
        this.A03 = viewGroup;
        this.A07 = igTextView2;
        this.A0A = igImageView2;
        this.A09 = igImageView3;
        this.A0C = igdsBottomButtonLayout;
    }

    public final C146958n9 create(Object obj, C146958n9 r19) {
        AnonymousClass066 r5 = this.A05;
        AnonymousClass061 r4 = this.A04;
        AnonymousClass1YL r11 = this.A0B;
        View view = this.A01;
        View view2 = this.A02;
        IgdsImageCell igdsImageCell = this.A0D;
        return new EventStickerBottomSheetFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(view, view2, this.A03, r4, r5, this.A06, this.A07, this.A08, this.A0A, this.A09, r11, this.A0C, igdsImageCell, this.A0F, this.A0E, r19);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            AnonymousClass062 lifecycle = this.A05.getLifecycle();
            AnonymousClass061 r10 = this.A04;
            AnonymousClass1YL r30 = this.A0B;
            View view = this.A02;
            IgdsImageCell igdsImageCell = this.A0D;
            IgTextView igTextView = this.A06;
            IgImageView igImageView = this.A08;
            IgdsListCell igdsListCell = this.A0F;
            IgdsListCell igdsListCell2 = this.A0E;
            ViewGroup viewGroup = this.A03;
            IgTextView igTextView2 = this.A07;
            IgImageView igImageView2 = this.A0A;
            IgTextView igTextView3 = igTextView2;
            IgImageView igImageView3 = igImageView2;
            IgdsListCell igdsListCell3 = igdsListCell2;
            ViewGroup viewGroup2 = viewGroup;
            IgImageView igImageView4 = igImageView;
            IgdsListCell igdsListCell4 = igdsListCell;
            IgdsImageCell igdsImageCell2 = igdsImageCell;
            IgTextView igTextView4 = igTextView;
            View view2 = view;
            AnonymousClass1YL r15 = r30;
            KtSLambdaShape0S01400000_I2 ktSLambdaShape0S01400000_I2 = new KtSLambdaShape0S01400000_I2(r15, this.A01, view2, igdsImageCell2, igTextView4, igImageView4, igdsListCell4, igdsListCell3, viewGroup2, igTextView3, igImageView3, this.A09, this.A0C, (C146958n9) null, 0);
            this.A00 = 1;
            if (AnonymousClass3J4.A00(r10, lifecycle, this, ktSLambdaShape0S01400000_I2) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventStickerBottomSheetFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
