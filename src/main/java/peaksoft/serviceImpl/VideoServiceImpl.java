package peaksoft.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.entity.Video;
import peaksoft.repository.VideoRepository;
import peaksoft.service.VideoService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    @Autowired
    public VideoServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public void saveVideo(Long lessonId, Video video) {
        videoRepository.saveVideo(lessonId, video);
    }

    @Override
    public void updateVideo(Long id, Video video) {
        videoRepository.updateVideo(id, video);
    }

    @Override
    public Video getVideoById(Long id) {
        return videoRepository.getVideoById(id);
    }

    @Override
    public List<Video> getAllVideos(Long id) {
        return videoRepository.getAllVideos(id);
    }

    @Override
    public void deleteVideoById(Long id) {
        videoRepository.deleteVideoById(id);
    }

}
