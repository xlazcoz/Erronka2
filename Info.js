const btn=document.getElementById('play-botoia');
const foto=document.getElementById('argazkia');
const video=document.getElementById('bideoa');

btn.addEventListener('click',()=>{
    foto.style.display = 'none';
    btn.style.display = 'none';
    video.style.display = 'block';
     video.play();
}
);