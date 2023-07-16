package com.instagram.brandedcontent.projectboard.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class CAMDiscoveryCampaignSearchResponseImpl extends TreeJNI implements C81204nM {

    public final class CamCreatorProfile extends TreeJNI implements C81204nM {

        public final class CreatorProfile extends TreeJNI implements C81204nM {

            public final class CreatorCampaigns extends TreeJNI implements C81204nM {

                public final class Edges extends TreeJNI implements C81204nM {

                    public final class Node extends TreeJNI implements C81204nM {

                        public final class BcpCampaign extends TreeJNI implements C81204nM {

                            public final class CampaignPhoto extends TreeJNI implements C81204nM {

                                public final class Image extends TreeJNI implements C81204nM {
                                    public final String[] getScalarFields() {
                                        return C18230wP.A1Z();
                                    }
                                }

                                public final C108776iv[] getEdgeFields() {
                                    return AnonymousClass0wJ.A1a(Image.class, "image");
                                }

                                public final String[] getScalarFields() {
                                    return C18210wN.A1Z();
                                }
                            }

                            public final String[] getScalarFields() {
                                return new String[]{"campaign_visibility", "content_delivery_deadline", DevServerEntity.COLUMN_DESCRIPTION, "id", FXPFAccessLibraryDebugFragment.NAME};
                            }

                            public final C108776iv[] getEdgeFields() {
                                return AnonymousClass0wJ.A1a(CampaignPhoto.class, "campaign_photo");
                            }
                        }

                        public final C108776iv[] getEdgeFields() {
                            return AnonymousClass0wJ.A1a(BcpCampaign.class, "bcp_campaign");
                        }
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Node.class, "node");
                    }
                }

                public final class PageInfo extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"end_cursor", "has_next_page"};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(Edges.class, "edges", true), PageInfo.class, "page_info", false);
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(CreatorCampaigns.class, "creator_campaigns(after:$after_cursor,before:$before_cursor,first:$first,last:$last,query_params:$params)");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(CreatorProfile.class, "creator_profile");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CamCreatorProfile.class, "cam_creator_profile");
    }
}
