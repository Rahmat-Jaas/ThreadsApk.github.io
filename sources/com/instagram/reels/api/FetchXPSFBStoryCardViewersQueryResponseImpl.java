package com.instagram.reels.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchXPSFBStoryCardViewersQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpFetchStory extends TreeJNI implements C81204nM {

        public final class InlineXFBXPSStoryCardCXPWrapper extends TreeJNI implements C81204nM {

            public final class FbStory extends TreeJNI implements C81204nM {

                public final class Author extends TreeJNI implements C81204nM {

                    public final class InlineXFBXPSUser extends TreeJNI implements C81204nM {

                        public final class StorySettings extends TreeJNI implements C81204nM {

                            public final class InlineXFBXPSStorySettings extends TreeJNI implements C81204nM {
                                public final String[] getScalarFields() {
                                    return new String[]{"is_public"};
                                }
                            }

                            public final Class[] getInlineClasses() {
                                return new Class[]{InlineXFBXPSStorySettings.class};
                            }
                        }

                        public final C108776iv[] getEdgeFields() {
                            return AnonymousClass0wJ.A1a(StorySettings.class, "story_settings");
                        }
                    }

                    public final Class[] getInlineClasses() {
                        return new Class[]{InlineXFBXPSUser.class};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"id", "is_archived_story"};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Author.class, "author");
                }

                public final Class[] getInlineClasses() {
                    return new Class[]{FBStoryFeedbackFragmentImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(FbStory.class, "story_card");
            }
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineXFBXPSStoryCardCXPWrapper.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(XcxpFetchStory.class, "xcxp_fetch_story(content_destinations:[\"FB\"],content_source:\"IG\",id:$id)");
    }
}
