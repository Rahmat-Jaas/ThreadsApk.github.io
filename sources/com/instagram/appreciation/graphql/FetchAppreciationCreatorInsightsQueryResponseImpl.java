package com.instagram.appreciation.graphql;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.pando.TreeJNI;

public final class FetchAppreciationCreatorInsightsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Viewer extends TreeJNI implements C81204nM {

        public final class User extends TreeJNI implements C81204nM {

            public final class ContentAppreciationInsights extends TreeJNI implements C81204nM {

                public final class LifetimeEstimatedEarnings extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{ContentAppreciationMetricsDataImpl.class};
                    }
                }

                public final class MonthlyMetrics extends TreeJNI implements C81204nM {

                    public final class Edges extends TreeJNI implements C81204nM {

                        public final class Node extends TreeJNI implements C81204nM {

                            public final class MetricsData extends TreeJNI implements C81204nM {
                                public final Class[] getInlineClasses() {
                                    return new Class[]{ContentAppreciationMetricsDataImpl.class};
                                }
                            }

                            public final String[] getScalarFields() {
                                return new String[]{"formatted_month_string"};
                            }

                            public final C108776iv[] getEdgeFields() {
                                return AnonymousClass0wJ.A1a(MetricsData.class, "metrics_data");
                            }
                        }

                        public final C108776iv[] getEdgeFields() {
                            return AnonymousClass0wJ.A1a(Node.class, "node");
                        }
                    }

                    public final class PageInfo extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"has_next_page", "start_cursor"};
                        }
                    }

                    public final C108776iv[] getEdgeFields() {
                        return C18180wK.A1a(C18190wL.A0G(Edges.class, "edges", true), PageInfo.class, "page_info", false);
                    }
                }

                public final class TopEarningContent extends TreeJNI implements C81204nM {

                    public final class Media extends TreeJNI implements C81204nM {

                        public final class MediaGiftEarnings extends TreeJNI implements C81204nM {
                            public final String[] getScalarFields() {
                                return new String[]{"amount_with_offset", "formatted_amount"};
                            }
                        }

                        public final String[] getScalarFields() {
                            return new String[]{"creation_time", "display_url", "instagram_media_id"};
                        }

                        public final C108776iv[] getEdgeFields() {
                            return AnonymousClass0wJ.A1a(MediaGiftEarnings.class, AnonymousClass000.A00(180));
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"formatted_date"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Media.class, "media");
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(LifetimeEstimatedEarnings.class, AnonymousClass000.A00(178), false), C18190wL.A0G(TopEarningContent.class, AnonymousClass000.A00(1158), true), C18190wL.A0G(MonthlyMetrics.class, AnonymousClass000.A00(HttpStatus.SC_METHOD_NOT_ALLOWED), false)};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ContentAppreciationInsights.class, AnonymousClass000.A00(150));
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(User.class, "user");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Viewer.class, "viewer");
    }
}
