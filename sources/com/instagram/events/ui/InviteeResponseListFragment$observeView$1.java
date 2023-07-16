package com.instagram.events.ui;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass1aM;
import X.AnonymousClass1lN;
import X.AnonymousClass1pA;
import X.AnonymousClass1pB;
import X.AnonymousClass1pC;
import X.AnonymousClass253;
import X.AnonymousClass2O4;
import X.C04220Ms;
import X.C146958n9;
import X.C150388wA;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C39142Kno;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.events.ui.InviteeResponseListFragment$observeView$1", f = "InviteeResponseListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InviteeResponseListFragment$observeView$1 extends C39142Kno implements AnonymousClass0YP {
    public /* synthetic */ Object A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewGroup A03;
    public final /* synthetic */ ViewGroup A04;
    public final /* synthetic */ ViewGroup A05;
    public final /* synthetic */ ViewGroup A06;
    public final /* synthetic */ IgTextView A07;
    public final /* synthetic */ IgTextView A08;
    public final /* synthetic */ IgTextView A09;
    public final /* synthetic */ IgTextView A0A;
    public final /* synthetic */ IgTextView A0B;
    public final /* synthetic */ IgTextView A0C;
    public final /* synthetic */ IgTextView A0D;
    public final /* synthetic */ IgTextView A0E;
    public final /* synthetic */ IgTextView A0F;
    public final /* synthetic */ IgImageView A0G;
    public final /* synthetic */ IgImageView A0H;
    public final /* synthetic */ IgImageView A0I;
    public final /* synthetic */ IgImageView A0J;
    public final /* synthetic */ AnonymousClass1aM A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteeResponseListFragment$observeView$1(View view, View view2, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, IgTextView igTextView, IgTextView igTextView2, IgTextView igTextView3, IgTextView igTextView4, IgTextView igTextView5, IgTextView igTextView6, IgTextView igTextView7, IgTextView igTextView8, IgTextView igTextView9, IgImageView igImageView, IgImageView igImageView2, IgImageView igImageView3, IgImageView igImageView4, AnonymousClass1aM r22, C146958n9 r23) {
        super(2, r23);
        this.A01 = view;
        this.A0K = r22;
        this.A02 = view2;
        this.A0F = igTextView;
        this.A05 = viewGroup;
        this.A0I = igImageView;
        this.A0C = igTextView2;
        this.A0B = igTextView3;
        this.A04 = viewGroup2;
        this.A0H = igImageView2;
        this.A0A = igTextView4;
        this.A09 = igTextView5;
        this.A06 = viewGroup3;
        this.A0J = igImageView3;
        this.A0E = igTextView6;
        this.A0D = igTextView7;
        this.A03 = viewGroup4;
        this.A0G = igImageView4;
        this.A08 = igTextView8;
        this.A07 = igTextView9;
    }

    public final C146958n9 create(Object obj, C146958n9 r39) {
        View view = this.A01;
        AnonymousClass1aM r18 = this.A0K;
        View view2 = this.A02;
        IgTextView igTextView = this.A0F;
        IgImageView igImageView = this.A0I;
        IgTextView igTextView2 = this.A0C;
        IgTextView igTextView3 = this.A0B;
        ViewGroup viewGroup = this.A04;
        IgImageView igImageView2 = this.A0H;
        IgTextView igTextView4 = this.A0A;
        IgTextView igTextView5 = this.A09;
        ViewGroup viewGroup2 = this.A06;
        IgImageView igImageView3 = this.A0J;
        IgTextView igTextView6 = this.A0E;
        IgTextView igTextView7 = this.A0D;
        ViewGroup viewGroup3 = this.A03;
        IgImageView igImageView4 = this.A0G;
        ViewGroup viewGroup4 = viewGroup2;
        ViewGroup viewGroup5 = viewGroup3;
        IgTextView igTextView8 = igTextView;
        IgTextView igTextView9 = igTextView2;
        IgTextView igTextView10 = igTextView3;
        View view3 = view;
        View view4 = view2;
        ViewGroup viewGroup6 = viewGroup;
        InviteeResponseListFragment$observeView$1 inviteeResponseListFragment$observeView$1 = new InviteeResponseListFragment$observeView$1(view3, view4, this.A05, viewGroup6, viewGroup4, viewGroup5, igTextView8, igTextView9, igTextView10, igTextView4, igTextView5, igTextView6, igTextView7, this.A08, this.A07, igImageView, igImageView2, igImageView3, igImageView4, r18, r39);
        inviteeResponseListFragment$observeView$1.A00 = obj;
        return inviteeResponseListFragment$observeView$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InviteeResponseListFragment$observeView$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass0OU.A00(obj);
        AnonymousClass2O4 r1 = (AnonymousClass2O4) this.A00;
        if (r1 instanceof AnonymousClass1pA) {
            this.A01.setVisibility(0);
        } else if (!(r1 instanceof AnonymousClass1pB) && (r1 instanceof AnonymousClass1pC)) {
            this.A01.setVisibility(8);
            AnonymousClass1aM r8 = this.A0K;
            AnonymousClass1pC r12 = (AnonymousClass1pC) r1;
            r8.A00 = C18220wO.A0Z(C18220wO.A0Y(r8), new AnonymousClass1lN(r8, r8.A02, AnonymousClass0wJ.A0X(r8.A03), r12.A0D));
            RecyclerView recyclerView = (RecyclerView) this.A02.findViewById(R.id.invitee_recycler_view);
            C150388wA r2 = r8.A00;
            if (r2 == null) {
                C04220Ms.A0E("adapter");
                throw null;
            }
            recyclerView.setAdapter(r2);
            C18190wL.A1D(recyclerView);
            r8.A01 = C18200wM.A0s(r12.A0A);
            boolean z = r12.A0E;
            if (z) {
                AnonymousClass1aM.A01(r8);
            }
            IgTextView igTextView = this.A0F;
            List list = r8.A01;
            int i2 = 0;
            if (list == null || list.size() == 0) {
                i2 = 8;
            }
            igTextView.setVisibility(i2);
            Serializable serializable = r8.requireArguments().getSerializable("response_page_type");
            AnonymousClass253 r14 = AnonymousClass253.GOING;
            if (serializable == r14) {
                i = 2131834894;
            } else if (serializable == AnonymousClass253.MAYBE) {
                i = 2131834895;
            } else if (serializable == AnonymousClass253.CANT_GO) {
                i = 2131834893;
            } else if (serializable == AnonymousClass253.INVITED) {
                i = 2131829230;
            } else {
                i = 2131834891;
                if (serializable == AnonymousClass253.NONE) {
                    i = 2131834842;
                }
            }
            igTextView.setText(i);
            if (r8.requireArguments().getSerializable("response_page_type") == AnonymousClass253.INVITED) {
                if (z) {
                    List list2 = r12.A0B;
                    if (C18190wL.A1a(list2)) {
                        AnonymousClass1aM.A00(this.A05, this.A0C, this.A0B, this.A0I, r8, AnonymousClass253.REQUESTED, r12.A05, r12.A04, list2);
                    }
                }
                List list3 = r12.A09;
                if (C18190wL.A1a(list3)) {
                    ViewGroup viewGroup = this.A04;
                    IgImageView igImageView = this.A0H;
                    AnonymousClass1aM.A00(viewGroup, this.A0A, this.A09, igImageView, r8, r14, r12.A03, r12.A02, list3);
                }
                List list4 = r12.A0C;
                if (C18190wL.A1a(list4)) {
                    AnonymousClass1aM.A00(this.A06, this.A0E, this.A0D, this.A0J, r8, AnonymousClass253.MAYBE, r12.A07, r12.A06, list4);
                }
                List list5 = r12.A08;
                if (C18190wL.A1a(list5)) {
                    AnonymousClass1aM.A00(this.A03, this.A08, this.A07, this.A0G, r8, AnonymousClass253.CANT_GO, r12.A01, r12.A00, list5);
                }
            }
        }
        return Unit.A00;
    }
}
