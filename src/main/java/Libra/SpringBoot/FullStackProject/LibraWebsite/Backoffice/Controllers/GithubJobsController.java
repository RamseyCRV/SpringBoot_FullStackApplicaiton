package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GithubJobsController {

    @GetMapping(value = "/backoffice_github_jobs")
    public String getJobs(Model model) {

        return "./Backoffice/github_jobs";
    }
}
