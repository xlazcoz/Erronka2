const botoia=document.getElementById('play-botoia');
const foto=document.getElementById('argazkia');
const video=document.getElementById('bideoa');

botoia.addEventListener('click',()=>{
    foto.style.display = 'none';
    botoia.style.display = 'none';
    video.style.display = 'block';
     video.play();
}
);