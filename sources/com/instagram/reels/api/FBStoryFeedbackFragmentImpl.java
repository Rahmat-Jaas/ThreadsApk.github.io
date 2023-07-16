package com.instagram.reels.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class FBStoryFeedbackFragmentImpl extends TreeJNI implements C81204nM {

    public final class EdgeStoryMediaViewers extends TreeJNI implements C81204nM {

        public final class Edges extends TreeJNI implements C81204nM {

            public final class EmojiReactions extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"reaction", "reactor_id"};
                }
            }

            public final class Node extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBStoryViewerFragmentImpl.class};
                }
            }

            public final class Reply extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{DialogModule.KEY_MESSAGE, "replier_id"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(EmojiReactions.class, "emoji_reactions", true), C18190wL.A0G(Reply.class, "reply", false), C18190wL.A0G(Node.class, "node", false)};
            }
        }

        public final class PageInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"end_cursor", "has_next_page", "has_previous_page", "start_cursor"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"count"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Edges.class, "edges", true), PageInfo.class, "page_info", false);
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"nonfriend_viewers_count"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(EdgeStoryMediaViewers.class, "edge_story_media_viewers(after:$after,before:$before,first:$first,last:$last)");
    }
}
