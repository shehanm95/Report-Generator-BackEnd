package edu.eastern.reportgenerator.report;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService{
    final ReportRepository reportRepository;
    @Override
    public Report saveReport(Report report) {
       return report;
    }
}
