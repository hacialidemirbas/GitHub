package Projects;

import java.util.List;

public class Survey {
    public static void main(String[] args) {
        SurveyPreparing mySurvey = new SurveyPreparing();
        List<SurveyQuestions> survey= mySurvey.prepSurvey(3);
        mySurvey.startSurvey(survey);
    }


}
