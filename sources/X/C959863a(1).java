package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.util.ArrayList;

/* renamed from: X.63a  reason: invalid class name and case insensitive filesystem */
public final class C959863a extends AnonymousClass5NL implements C144388iI {
    public final AnonymousClass5LC D2T() {
        ImmutableList<C144398iJ> optionalTreeListByHashCode = getOptionalTreeListByHashCode(-1910259830, C959963b.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C144398iJ D2U : optionalTreeListByHashCode) {
                A0w.add(D2U.D2U());
            }
            return new AnonymousClass5LC((StoryTrendingPromptSubType) A09(C139258Ng.A00, -282424929), A0w);
        }
        throw AnonymousClass0wJ.A0b();
    }
}
