package X;

import android.os.Bundle;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.feed.fragment.ContextualFeedFragment;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.6P0  reason: invalid class name */
public final class AnonymousClass6P0 {
    public static final Object A00(AnonymousClass601 r29, C63893iY r30) {
        AnonymousClass601 r2 = r29;
        C63893iY r0 = r30;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r2);
        Object A0B = C63893iY.A0B(r0, 0);
        A0B.getClass();
        Hashtag hashtag = (Hashtag) A0B;
        String A0D = C63893iY.A0D(r0, A1Z ? 1 : 0);
        String A0n = C18190wL.A0n(UUID.randomUUID());
        Bundle A06 = C18180wK.A06();
        SectionPagination sectionPagination = new SectionPagination((String) null, (String) null, AnonymousClass0wJ.A0v());
        C35376Ite ite = C35376Ite.TOP;
        String str = hashtag.A0C;
        if (str == null) {
            str = "";
        }
        A06.putParcelable(I17.A00(217), new HashtagContextualFeedConfig(new EntityContextualFeedConfig(sectionPagination, ite, str, (String) null, 0, 10, A1Z), hashtag, A0n, A0D));
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(A0D);
        C25786Drz A0Q = C18180wK.A0Q(C63913ic.A05(r2), C63913ic.A0F(r2));
        IgFragmentFactoryImpl.A00();
        String A00 = I17.A00(167);
        String A002 = I17.A00(229);
        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
        contextualFeedFragment.setArguments(C19233Asv.A00(A06, (C11480kH) null, (ContextualFeedNetworkConfig) null, (SearchContext) null, (Integer) null, A00, (String) null, (String) null, A0D, A002, (String) null, (String) null, (String) null, A0n, A0v, false, false, false, false, false, A1Z, false));
        A0Q.A03 = contextualFeedFragment;
        A0Q.A08();
        A0Q.A05();
        return null;
    }
}
