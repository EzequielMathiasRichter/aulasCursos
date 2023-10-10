
let sexo_M = document.getElementById('sexo_M');
let sexo_F = document.getElementById('sexo_F');
let button = document.getElementById('button');
let txt_sexo = document.getElementById('txt_sexo');
let imagem = document.getElementById('imagem')
button.addEventListener('click', clicar)
let agora = new Date();
let hoje = agora.getFullYear();
function clicar(){
    let ano_nascimento = document.getElementById('ano_nascimento');
    let txt_idade = document.getElementById('txt_idade');
    let n1 = Number(ano_nascimento.value)
    let res = hoje - n1
    if(n1>hoje){
        alert('Valor de nascimento inválido. Digite novamente!')
    }
    else if(res>100){
        alert('Valor de nascimento inválido. Digite novamente!')
    }
    else{
        
        if(sexo_M.checked ===false && sexo_F.checked ===false){
            alert('Opções de sexo marcadas incorretamente. Favor marcar corretamente!')
        }
        else if(sexo_M.checked === true && sexo_F.checked ===false){
            txt_sexo.innerHTML = 'um homem'
            txt_idade.innerHTML = res
            if(res>0 && res < 18){
                imagem.setAttribute('src', "imagens/criançaM.jpg")
            }
            else if(res>18 && res<50){
                imagem.setAttribute('src', "imagens/adultoM.jpg")
            }
            else{
                imagem.setAttribute('src', "imagens/idosoM.jpg")
            }
        }
        else if(sexo_M.checked === false && sexo_F.checked ===true){
            txt_sexo.innerHTML = 'uma mulher'
            txt_idade.innerHTML = res
            if(res>0 && res < 18){
                imagem.setAttribute('src', "imagens/criançaF.jpg")
            }
            else if(res>18 && res<50){
                imagem.setAttribute('src', "imagens/adultoF.jpg")
            }
            else{
                imagem.setAttribute('src', "imagens/idosoF.jpg")
            }
        }
        else{
            alert('Opções de sexo marcadas incorretamente. Favor marcar corretamente!')
        }
    }
}