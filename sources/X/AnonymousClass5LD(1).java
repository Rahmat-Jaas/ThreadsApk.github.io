package X;

import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;

/* renamed from: X.5LD  reason: invalid class name */
public final class AnonymousClass5LD extends AnonymousClass0Sf implements C144398iJ {
    public final StoryTrendingPromptMediaSubType A00;
    public final String A01;

    public final AnonymousClass5LD D2U() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LD) {
                AnonymousClass5LD r5 = (AnonymousClass5LD) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public AnonymousClass5LD(StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType, String str) {
        AnonymousClass0wJ.A1O(str, storyTrendingPromptMediaSubType);
        this.A01 = str;
        this.A00 = storyTrendingPromptMediaSubType;
    }
}
