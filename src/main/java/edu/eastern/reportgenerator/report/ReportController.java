package edu.eastern.reportgenerator.report;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportController {

    final ReportService reportService;
    @GetMapping("")
    public String work(){
        return "working";
    }

    @PostMapping("save")
    public ResponseEntity<Report> saveReport(@RequestBody Report report){
        return ResponseEntity.ok(reportService.saveReport(report));
    }
}
